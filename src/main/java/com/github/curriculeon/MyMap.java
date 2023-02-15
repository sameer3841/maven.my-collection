package com.github.curriculeon;

public class MyMap<KeyType extends Object, ValueType extends Object> 
implements MyMapInterface <KeyType,ValueType> {

    private MyArrayList<KeyValue<KeyType,ValueType>> map;

    public MyMap(){
        this.map = new MyArrayList<>();
    }

    public MyMap(MyArrayList<KeyValue<KeyType,ValueType>> map){
        this.map = map;
    }

    @Override
    public void put(KeyType key, ValueType value) {
        map.add(new KeyValue<>(key,value));
    }

    @Override
    public ValueType get(KeyType key) {
        // TODO Auto-generated method stub
        for(KeyValue<KeyType, ValueType> keySet : map){
            KeyType current = keySet.getKey();
            if(current.equals(key)){
                ValueType currentVal = keySet.getValue();
                return currentVal;
            }
        }
        return null;
    }

    @Override
    public MySet getKeySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MyCollectionInterface getValues() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MySet getList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MyMapInterface invert() {
        // TODO Auto-generated method stub
        return null;
    }
}
