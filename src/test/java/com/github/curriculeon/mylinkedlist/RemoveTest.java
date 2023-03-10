package com.github.curriculeon.mylinkedlist;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyLinkedList;
import com.github.curriculeon.MyCollectionInterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
@SuppressWarnings("all")
public class RemoveTest {
    //given
    private <SomeType> void test(SomeType someElement, SomeType[] valuesToBePopulatedWith, SomeType[] expectedElementSequence) {
        MyLinkedList<SomeType> myList = new MyLinkedList<>();
        ImportChecker.scanClass(myList.getClass(), "java.util", "MyArrayList", "MySet", "MyCollectionInterface");
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        for (SomeType someValue : valuesToBePopulatedWith) {
            myCollection.add(someValue);
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);
        }
        Integer preRemoveLength = myCollection.size();
        Integer expectedPreRemovedLength = valuesToBePopulatedWith.length;
        Assert.assertEquals(expectedPreRemovedLength,preRemoveLength);
        Integer expectedPostRemoveLength = preRemoveLength - 1;

        //when
        myCollection.remove(someElement);
    }


    @Test
    public void test0() {
        int indexOfElementToRemove = 1;
        String[] valuesToPopulateCollection = new String[]{"The", "Quick", "Brown", "Fox"};
        String[] expectedElementSequence = new String[]{"The", "Brown", "Fox"};
        String elementToRemove = valuesToPopulateCollection[1];
        test(elementToRemove,valuesToPopulateCollection,expectedElementSequence);
    }

    @Test
    public void test1() {
        Integer[] valuesToPopulateCollection = new Integer[]{1,3,5,8,13};
        Integer[] expectedElementSequence = new Integer[]{3,5,8,13};
        int indexOfElementToRemove = 0;
        Integer elementToRemove = valuesToPopulateCollection[indexOfElementToRemove];
        test(elementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }

    @Test
    public void test2() {
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        Date[] valuesToPopulateCollection = new Date[]{d1,d2,d3};
        Date[] expectedElementSequence = new Date[]{d1,d2};
        int indexOfElementToRemove = 2;
        Date elementToRemove = valuesToPopulateCollection[indexOfElementToRemove];
        test(elementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }
}
