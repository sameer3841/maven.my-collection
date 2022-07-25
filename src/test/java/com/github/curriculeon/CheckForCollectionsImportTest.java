package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class CheckForCollectionsImportTest {
    private static void getAllFiles() {

    }

    @Test
    public void checkForCollectionsTest() {
        try {
            final String currentDirectory = System.getProperty("user.dir");
            final Path path = Paths.get(currentDirectory);
            final BiPredicate<Path, BasicFileAttributes> condition = (p, bfa) -> bfa.isRegularFile();
            Files
                    .find(path, 999, condition)
                    .filter(eachPath -> eachPath.toFile().toString().endsWith(".java"))
                    .forEach(classPath -> {
                        try {
                            Files
                                    .lines(classPath, Charset.defaultCharset())
                                    .forEach(line -> {
                                        String errorMessage = "Class [ %s ] contained an illegal import!";
                                        errorMessage = String.format(errorMessage, classPath);
                                        Assert.assertFalse(errorMessage, line.contains("java.util."));
                                    });
                        } catch (final IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

    }
}
