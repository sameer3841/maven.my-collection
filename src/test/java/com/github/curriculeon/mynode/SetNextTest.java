package com.github.curriculeon.mynode;

import com.github.curriculeon.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class SetNextTest {
    @Test
    public void testSetNext() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        MyNode<String> expectedNext = new MyNode<>();

        // Act
        node.setNext(expectedNext);

        // Assert
        Assert.assertEquals(expectedNext, node.getNext());
    }

    @Test
    public void testSetNextWithNull() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        MyNode<String> expectedNext = null;

        // Act
        node.setNext(expectedNext);

        // Assert
        Assert.assertEquals(expectedNext, node.getNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNextWithSelfLoop() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        // create a self loop by setting a node as its next
        node.setNext(node);
    }

    @Test
    public void testSetNextWithMultipleNodes() {
        // Arrange
        MyNode<String> node1 = new MyNode<>();
        MyNode<String> node2 = new MyNode<>();
        MyNode<String> node3 = new MyNode<>();
        // set nodes as next
        node1.setNext(node2);
        node2.setNext(node3);
        // Assert
        Assert.assertEquals(node2, node1.getNext());
        Assert.assertEquals(node3, node2.getNext());
    }

}
