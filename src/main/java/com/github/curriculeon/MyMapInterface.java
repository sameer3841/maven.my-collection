package com.github.curriculeon;

import java.util.List;
import java.util.Set;

public interface MyMapInterface<KeyType, ValueType> {
    void put(KeyType key, ValueType value);
    ValueType get(KeyType key);
    Set<KeyType> getKeySet();
    List<ValueType> getValues();
    Set<KeyValue<KeyType, ValueType>> getList();
    MyMapInterface<ValueType, KeyType> invert();
}
