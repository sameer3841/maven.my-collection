package com.github.curriculeon;

public class MyNode<SomeType> {

    private SomeType data;
    private MyNode<SomeType> next;

    public MyNode() {
        setData(null);
        setNext(null);
    }

    public MyNode(SomeType data){
        setData(data);
    }

    public MyNode(SomeType data, MyNode<SomeType> next) {
        setData(data);
        setNext(next);
    }

    public SomeType getData() {
        return data;
    }

    public void setData(SomeType data) {
        this.data = data;
    }

    public MyNode<SomeType> getNext() {
        return next;
    }

    public void setNext(MyNode<SomeType> next) {
        if(next == this)
            throw new IllegalArgumentException();
        this.next = next;
    }

    public Boolean hasNext(){
        return next != null;
    }
}
