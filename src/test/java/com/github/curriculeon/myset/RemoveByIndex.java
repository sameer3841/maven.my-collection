package com.github.curriculeon.myset;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 12/15/2019 - 8:20 PM
 */
@SuppressWarnings("all")
public class RemoveByIndex {
    //given
    private <SomeType> void test(int indexOfElementToRemove, SomeType[] valuesToBePopulatedWith, SomeType[] expectedElementSequence) {
        MySet<SomeType> myList = new MySet<>(valuesToBePopulatedWith);
        ImportChecker.scanClass(myList.getClass());
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        // given elements have been added to collection
        for (SomeType someValue : valuesToBePopulatedWith) {
            myCollection.add(someValue);
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);
        }
        Integer preRemoveLength = myCollection.size(); // get size of collection
        Integer expectedPreRemoveLength = valuesToBePopulatedWith.length;
        Assert.assertEquals(expectedPreRemoveLength, preRemoveLength); // ensure length is correct
        Integer expectedPostRemoveLength = preRemoveLength - 1;// get the expected post-removal length

        // when
        myCollection.remove(indexOfElementToRemove);
        Integer postRemoveLength = myCollection.size(); // get size of collection
        Integer actualPostRemoveLength = postRemoveLength; // get the actual post-removal length

        // then
        Assert.assertEquals(expectedPostRemoveLength, actualPostRemoveLength);
        for (int currentIndex = 0; currentIndex < expectedElementSequence.length; currentIndex++) {
            SomeType expectedElement = expectedElementSequence[currentIndex];
            SomeType actualElement = myCollection.get(currentIndex);
            Assert.assertEquals(expectedElement, actualElement);
        }
    }


    @Test
    public void test0() {
        String[] valuesToPopulateCollection = new String[]{"The", "Quick", "Brown", "Fox"};
        String[] expectedElementSequence = new String[]{"The", "Brown", "Fox"};
        int indexOfElementToRemove = 1;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }


    @Test
    public void test1() {
        Integer[] valuesToPopulateCollection = new Integer[]{1,3,5,8,13};
        Integer[] expectedElementSequence = new Integer[]{3,5,8,13};
        int indexOfElementToRemove = 0;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }

    @Test
    public void test2() {
        Object d1 = new Object();
        Object d2 = new Object();
        Object d3 = new Object();
        Object[] valuesToPopulateCollection = new Object[]{d1,d2,d3};
        Object[] expectedElementSequence = new Object[]{d1,d2};
        int indexOfElementToRemove = 2;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }
}
