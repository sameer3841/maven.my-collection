package com.github.curriculeon.mynode;

import com.github.curriculeon.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class NonNullaryConstructorTest {

    @Test
    public void testConstructorWithValidData() {
        // Arrange
        String expectedData = "Hello World";
        MyNode<String> expectedNext = new MyNode<>();

        // Act
        MyNode<String> node = new MyNode<>(expectedData, expectedNext);

        // Assert
        Assert.assertEquals(expectedData, node.getData());
        Assert.assertEquals(expectedNext, node.getNext());
    }

    @Test
    public void testConstructorWithNullData() {
        // Arrange
        String expectedData = null;
        MyNode<String> expectedNext = new MyNode<>();

        // Act
        MyNode<String> node = new MyNode<>(expectedData, expectedNext);

        // Assert
        Assert.assertEquals(expectedData, node.getData());
        Assert.assertEquals(expectedNext, node.getNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithSelfLoop() {
        // Arrange
        MyNode<String> node = new MyNode<>();

        // Act
        MyNode<String> next = new MyNode<>(null, node);
        node.setNext(next);
    }

}
