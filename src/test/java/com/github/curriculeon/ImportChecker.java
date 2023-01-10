package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class ImportChecker {
    @Test
    public void checkForCollectionsTest() {
        try {
            final String currentDirectory = System.getProperty("user.dir") + "/src/main";
            final Path path = Paths.get(currentDirectory);
            final BiPredicate<Path, BasicFileAttributes> condition = (p, bfa) -> bfa.isRegularFile();
            Files
                    .find(path, 999, condition)
                    .filter(eachPath -> eachPath.toFile().toString().endsWith(".java"))
                    .forEach(this::scanClass);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void scanClass(Path classPath) {
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
    }

    public static void scanClass(Class<?> clazz) {
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.getType().getName().startsWith("java.util")) {
                final String errorMessage = "java.util package should not be imported in %s class.";
                throw new IllegalArgumentException(String.format(errorMessage, clazz.getName()));
            }
        }
    }
}
