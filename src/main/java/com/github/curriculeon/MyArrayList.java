package com.github.curriculeon;

import java.util.Iterator;

public class MyArrayList<SomeType extends Object>  implements MyCollectionInterface<SomeType>{

    private Integer length;
    private SomeType[] myArrayList;
    private static final Integer RE_SIZE = 5;


    public MyArrayList() {
        myArrayList = (SomeType[]) new Object[10];
        length = 0;
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.myArrayList = valuesToBePopulatedWith;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(SomeType objectToAdd) {
        // TODO Auto-generated method stub
        Integer threshold = myArrayList.length-1;
        if(length >= threshold) {
            Integer newSize = myArrayList.length + RE_SIZE;
            SomeType[] newContent = (SomeType[]) new Object[newSize];
            System.arraycopy(myArrayList, 0, newContent, 0 , myArrayList.length);
            myArrayList = newContent;
        }
        myArrayList[length] = objectToAdd;
        length++;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        // TODO Auto-generated method stub
        
        SomeType[] array = (SomeType[]) new Object[myArrayList.length];
        Integer newIndex = 0;
        for (SomeType currentElement : myArrayList) {
            if (currentElement == null) continue;
            if (!currentElement.equals(objectToRemove)) 
            {
                array[newIndex] = currentElement;
                newIndex++;
            } 
            else length--;
        }
        myArrayList = array;
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        // TODO Auto-generated method stub
        SomeType[] tracker = (SomeType[]) new Object[myArrayList.length - 1];
        int index = 0;
        for(int i = 0; i < myArrayList.length; i++)
            if(i != indexOfObjectToRemove){
                tracker[index] = myArrayList[i];
                index++;
            }
        myArrayList = tracker;
    }

    @Override
    public SomeType get(int indexOfElement) {
        // TODO Auto-generated method stub
        if(indexOfElement < myArrayList.length && indexOfElement > -1) return this.myArrayList[indexOfElement];
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        // TODO Auto-generated method stub
        for(SomeType theType : myArrayList)
            if(theType == objectToCheckFor) return true;
        return false;
    }

    @Override
    public Integer size() {
        // TODO Auto-generated method stub
        return length;
    }
}