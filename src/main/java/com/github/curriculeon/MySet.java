package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> implements MyCollectionInterface<SomeType>{

    private SomeType[] mySet = (SomeType[]) new Object[0];
    private int length;

    public MySet() {
        length = 0;
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        for(SomeType someType: valuesToBePopulatedWith)
            add(someType);
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
        SomeType[] track = (SomeType[]) new Object[mySet.length-1];
        int tracker = 0;
        for(SomeType someType : mySet) {
            if (someType == null) continue;
            if (someType != objectToRemove) {
                track[tracker] = someType;
                tracker++;
            } else length--;
        }
        mySet = track;
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        if(indexOfObjectToRemove > -1 && indexOfObjectToRemove < length){
            SomeType object = mySet[indexOfObjectToRemove];
            remove(object);
        }
    }

    @Override
    public SomeType get(int indexOfElement) {
        if( indexOfElement > -1 && indexOfElement < length )
            return mySet[indexOfElement];
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        if(length == 0) return false;
        for(SomeType tracker : mySet)
            if(tracker.equals(objectToCheckFor)) return true;
        return false;
    }

    @Override
    public Integer size() {return length;}

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
