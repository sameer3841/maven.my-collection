package com.github.curriculeon.myset;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
@SuppressWarnings("all")
public class AddTest {
    //given
    private <SomeType> void test(SomeType[] valuesToBePopulatedWith, int expectedSize) {
        MySet<SomeType> myList = new MySet<>();
        ImportChecker.scanClass(myList.getClass());
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        for (SomeType someValue : valuesToBePopulatedWith) {
            // when
            myCollection.add(someValue);

            // then
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);
        }
        int actualSize = myCollection.size();
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test
    public void test0() {
        test(new String[]{"The", "Quick", "Brown"}, 3);
    }

    @Test
    public void test1() {
        test(new Integer[]{1, 2, 3}, 3);
    }


    @Test
    public void test2() {
        test(new String[]{"The", "Quick", "Brown", "The"}, 3);
    }

    @Test
    public void test3() {
        test(new Integer[]{7, 7, 7, 7, 7, 7, 7}, 1);
    }

    @Test
    public void test4() {
        test(new Date[]{new Date(), new Date(), new Date()}, 1);
    }

    @Test
    public void test5() {
        test(new Date[]{new Date(), new Date(), new Date()}, 1);
    }
}
