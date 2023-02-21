package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{

    private MyNode<SomeType> head;
    private int length;

    public MyLinkedList() {
        head = new MyNode<>();
        length = 0;
    }

    @SafeVarargs
    public MyLinkedList(SomeType... valuesToBePopulatedWith) {
        head = new MyNode<>();
        for (SomeType someType : valuesToBePopulatedWith)
            add(someType);
        length = valuesToBePopulatedWith.length;
    }

    @Override
    public Iterator<SomeType> iterator() {
        // TODO Auto-generated method stub
        return new MyLinkedList.MyLinkedListIterator<>(this);
    }

    @Override
    public void add(SomeType objectToAdd) {
        // TODO Auto-generated method stub
        MyNode<SomeType> node = head;
        if(node.getData() == null) node.setData(objectToAdd);
        else {
            while (node.getNext() != null && node.hasNext()) node = node.getNext();
            MyNode<SomeType> endNode = new MyNode<>(objectToAdd);
            node.setNext(endNode);
        }
        length++;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        if (head==null){
            System.out.println("The inputted value does not exist within the list.");
            return;
        } else if (head.getData() == objectToRemove) {
            head.setData(null);
            length--;
            return;
        }
        MyNode<SomeType> node = head;
        while (node.getNext() != null && node.hasNext()) {
            if (node.getNext().getData() == objectToRemove) {
                MyNode<SomeType> nextNode;
                nextNode = node.getNext().getNext();
                node.setNext(nextNode);
                length--;
            }
            node = node.getNext();
        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        if(indexOfObjectToRemove > -1 && indexOfObjectToRemove < length) {
            MyNode<SomeType> node = head;
            for (int i = 0; i < indexOfObjectToRemove; i++) {
                node = node.getNext();
            }
            remove(node.getData());
        }
    }

    @Override
    public SomeType get(int indexOfElement) {
        // TODO Auto-generated method stub
        if(indexOfElement > -1 && indexOfElement < length){
            MyNode<SomeType> node = head;
            for(int i = 0; i < indexOfElement; i++)
                node = node.getNext();
            return node.getData();
        }
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        // TODO Auto-generated method stub
        if(head.getData() != null) {
            MyNode<SomeType> node = head;
            while (node != null) {
                SomeType dataCheck = node.getData();
                if (dataCheck.equals(objectToCheckFor)) return true;
                node = node.getNext();
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        // TODO Auto-generated method stub
        return length;
    }

    private static class MyLinkedListIterator<SomeType> implements Iterator<SomeType> {
        private MyNode<SomeType> currentNode;

        public MyLinkedListIterator(MyLinkedList<SomeType> list) {
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
