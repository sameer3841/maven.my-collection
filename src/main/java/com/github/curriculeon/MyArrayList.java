package com.github.curriculeon;

public class MyArrayList<SomeType> {

    private SomeType[] myArrayList;

    public MyArrayList() {
        myArrayList = (SomeType[]) new Object[0];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.myArrayList = valuesToBePopulatedWith;
    }
}
