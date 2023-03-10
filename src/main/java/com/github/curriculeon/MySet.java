package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType extends Object> implements MyCollectionInterface<SomeType>{

    private SomeType[] mySet;
    private int length;

    public MySet() {
        mySet = (SomeType[]) new Object[0];
        length = 0;
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        for(SomeType someType: valuesToBePopulatedWith){
            add(someType);
        }
        length = valuesToBePopulatedWith.length;
    }

    @Override
    public void add(SomeType objectToAdd) {
        if(!contains(objectToAdd)){
            if(length >= mySet.length-1) {
                SomeType[] track = (SomeType[]) new Object[mySet.length + 1];
                System.arraycopy(mySet, 0, track, 0, mySet.length);
                mySet = track;
            }
            mySet[length] = objectToAdd;
            length++;
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {

    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public SomeType get(int indexOfElement) {
        if( indexOfElement > -1 && indexOfElement < length )
            return mySet[indexOfElement];
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        for(SomeType tracker : mySet)
            if(tracker.equals(objectToCheckFor)) return true;
        return false;
    }

    @Override
    public Integer size() {
        return length;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
