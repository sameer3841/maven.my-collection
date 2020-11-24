package com.github.curriculeon.myarraylist;

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
        MyArrayList<?> myList = new MyArrayList<>();

        // when
        Boolean isInstanceOfMySet = (Object)myList instanceof MySet;
        Boolean isInstanceOfList = myList instanceof List;
        Boolean isInstanceOfCollection = myList instanceof Collection;
        Boolean isInstanceOfIterable = myList instanceof Iterable;
        Boolean isInstanceOfMyCollection = myList instanceof MyCollectionInterface;

        // then
        Assert.assertTrue(!isInstanceOfMySet);
        Assert.assertTrue(!isInstanceOfList);
        Assert.assertTrue(!isInstanceOfCollection);
        Assert.assertTrue(isInstanceOfIterable);
        Assert.assertTrue(isInstanceOfMyCollection);
    }
}