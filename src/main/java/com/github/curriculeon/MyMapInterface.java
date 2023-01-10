package com.github.curriculeon;

public interface MyMapInterface<KeyType, ValueType> {
    void put(KeyType key, ValueType value);
    ValueType get(KeyType key);
    MySet<KeyType> getKeySet();
    MyCollectionInterface<ValueType> getValues();
    MySet<KeyValue<KeyType, ValueType>> getList();
    MyMapInterface<ValueType, KeyType> invert();
}
