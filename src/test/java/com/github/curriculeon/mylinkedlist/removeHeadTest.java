package com.github.curriculeon.mylinkedlist;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class removeHeadTest {

    private <SomeType> void test(SomeType... valuesToBePopulatedWith){
        MyLinkedList<SomeType> myList = new MyLinkedList<>();
        ImportChecker.scanClass(myList.getClass(), "java.util", "MyArrayList", "MySet", "MyCollectionInterface");
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        for(SomeType someValue : valuesToBePopulatedWith){
            myCollection.add(someValue);
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);

            myCollection.remove(someValue);

            myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertFalse(myCollectionContainsValue);
        }

    }

    @Test
    public void test0(){test("The","Quick","Brown");}

    @Test
    public void test1(){test(1,2,3);}

    @Test
    public void test2(){test(new Date(), new Date(), new Date());}
}
