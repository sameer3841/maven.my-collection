package com.github.curriculeon.mynode;

import com.github.curriculeon.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {

    @Test
    public void testNullaryConstructor() {
        // Act
        MyNode<String> node = new MyNode<>();

        // Assert
        Assert.assertNull(node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testNullaryConstructorWithSettingData() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        String expectedData = "Hello World";

        // Act
        node.setData(expectedData);

        // Assert
        Assert.assertEquals(expectedData, node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testNullaryConstructorWithSettingNext() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        MyNode<String> expectedNext = new MyNode<>();

        // Act
        node.setNext(expectedNext);

        // Assert
        Assert.assertNull(node.getData());
        Assert.assertEquals(expectedNext, node.getNext());
    }
}
