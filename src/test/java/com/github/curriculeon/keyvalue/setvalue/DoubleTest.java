package com.github.curriculeon.keyvalue.setvalue;

import com.github.curriculeon.KeyValue;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
public class DoubleTest {
    private <ValueType> void test(ValueType expectedValue) {
        KeyValue<Object, ValueType> keyValue = new KeyValue<>(null, null);

        // when
        keyValue.setValue(expectedValue);
        ValueType actualValue = keyValue.getValue();

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void test0() {
        test(10.0);
    }

    @Test
    public void test1() {
        test(9.0);
    }

    @Test
    public void test2() {
        test(8.0);
    }
}