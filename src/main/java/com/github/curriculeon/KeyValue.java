package com.github.curriculeon;

import javax.naming.OperationNotSupportedException;

public class KeyValue<KeyType, ValueType> {
    public KeyValue(Object key, Object value) {
        throw new RuntimeException(new OperationNotSupportedException("Method not yet implemented")); // TODO
    }

    public KeyType getKey() {
        throw new RuntimeException(new OperationNotSupportedException("Method not yet implemented")); // TODO
    }

    public ValueType getValue() {
        throw new RuntimeException(new OperationNotSupportedException("Method not yet implemented")); // TODO
    }

    public void setKey(Object key) {
        throw new RuntimeException(new OperationNotSupportedException("Method not yet implemented")); // TODO
    }

    public void setValue(Object value) {
        throw new RuntimeException(new OperationNotSupportedException("Method not yet implemented")); // TODO
    }
}
