package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{
    public MyLinkedList() {
    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) {

    }

    @Override
    public Iterator<SomeType> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(SomeType objectToAdd) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(SomeType objectToRemove) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public SomeType get(int indexOfElement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer size() {
        // TODO Auto-generated method stub
        return null;
    }

    private static class MyLinkedListIterator<SomeType> implements Iterator<SomeType> {
        private MyLinkedList<SomeType> list;
        private MyNode<SomeType> currentNode;

        public MyLinkedListIterator(MyLinkedList<SomeType> list) {
            this.list = list;
            this.currentNode = new MyNode<>();
            this.currentNode.setData(list.get(0)); // this is the head
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public SomeType next() {
            SomeType value = currentNode.getData();
            currentNode = currentNode.getNext();
            return value;
        }
    }
}
