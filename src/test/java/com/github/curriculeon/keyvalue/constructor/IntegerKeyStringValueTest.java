package com.github.curriculeon.keyvalue.constructor;

import com.github.curriculeon.KeyValue;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
public class IntegerKeyStringValueTest {
    private <KeyType, ValueType> void test(KeyType key, ValueType value) {
        // when
        KeyValue<KeyType, ValueType> keyValue = new KeyValue<>(key, value);
        KeyType actualKey = keyValue.getKey();
        ValueType actualValue = keyValue.getValue();

        // then
        Assert.assertEquals(key, actualKey);
        Assert.assertEquals(value, actualValue);
    }

    @Test
    public void test0() {
        test(0, "zero");
    }

    @Test
    public void test1() {
        test(1, "1");
    }

    @Test
    public void test2() {
        test(2, "two");
    }


    @Test
    public void test3() {
        test(2, "2");
    }

    @Test
    public void test4() {
        test(3, "three");
    }

    @Test
    public void test5() {
        test(3, "3");
    }
}