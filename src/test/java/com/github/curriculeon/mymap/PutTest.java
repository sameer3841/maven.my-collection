package com.github.curriculeon.mymap;

import com.github.curriculeon.ImportChecker;
import com.github.curriculeon.MyMap;
import com.github.curriculeon.MyMapInterface;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 12/15/2019 - 8:59 PM
 */
public class PutTest {
    // given
    private <KeyType, ValueType> void test(KeyType key, ValueType value) {
        MyMap<KeyType, ValueType> myMap = new MyMap<>();
        ImportChecker.scanClass(myMap.getClass());
        MyMapInterface<KeyType, ValueType> myMapInterface = (MyMapInterface)myMap;

        // when
        myMapInterface.put(key, value);

        // then
        Assert.assertEquals(value, myMapInterface.get(key));
    }


    @Test
    public void test0() {
        test("The", "Quick");
    }

    @Test
    public void test1() {
        test(1, "one");
    }

    @Test
    public void test2() {
        test('a', "one");
    }

    @Test
    public void test3() {
        test('a', 1);
    }
}
