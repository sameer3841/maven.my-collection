package com.github.curriculeon.keyvalue.setkey;

import com.github.curriculeon.KeyValue;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author leonhunter
 * @created 12/15/2019
 */
public class LongTest {
    private <KeyType> void test(KeyType expectedKey) {
        KeyValue<KeyType, Object> keyValue = new KeyValue<>(null, null);

        // when
        keyValue.setKey(expectedKey);
        KeyType actualKey = keyValue.getKey();

        // then
        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    public void test0() {
        test(10L);
    }

    @Test
    public void test1() {
        test(9L);
    }

    @Test
    public void test2() {
        test(8L);
    }
}
