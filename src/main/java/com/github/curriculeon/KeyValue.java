package com.github.curriculeon;

import javax.naming.OperationNotSupportedException;

public class KeyValue<KeyType, ValueType> {

    private KeyType key;
    private ValueType value;
    public KeyValue(KeyType key, ValueType value) {
        setKey(key);
        setValue(value);
    }

    public KeyType getKey() {
        return key;
    }

    public ValueType getValue() {
        return value; 
    }

    public void setKey(KeyType key) {
        this.key = key;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
