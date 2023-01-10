package com.github.curriculeon.myset;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyArrayList;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
@SuppressWarnings("all")
public class NullaryConstructor {
    @Test
    public void testPolymorphism() {
        //given
        MySet<?> myList = new MySet<>();
        ImportChecker.scanClass(myList.getClass());

        // when
        Boolean isInstanceOfMyList = (Object)myList instanceof MyArrayList;
        Boolean isInstanceOfList = myList instanceof List;
        Boolean isInstanceOfCollection = myList instanceof Collection;
        Boolean isInstanceOfIterable = myList instanceof Iterable;
        Boolean isInstanceOfMyCollection = myList instanceof MyCollectionInterface;

        // then
        Assert.assertTrue(!isInstanceOfMyList);
        Assert.assertTrue(!isInstanceOfList);
        Assert.assertTrue(!isInstanceOfCollection);

        Assert.assertTrue(isInstanceOfIterable);
        Assert.assertTrue(isInstanceOfMyCollection);
    }
}