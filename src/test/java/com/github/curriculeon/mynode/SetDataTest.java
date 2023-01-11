package com.github.curriculeon.mynode;

import com.github.curriculeon.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class SetDataTest {

    @Test
    public void testSetData() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        String expectedData = "Hello World";

        // Act
        node.setData(expectedData);

        // Assert
        Assert.assertEquals(expectedData, node.getData());
    }

    @Test
    public void testSetDataWithNull() {
        // Arrange
        MyNode<String> node = new MyNode<>();
        String expectedData = null;

        // Act
        node.setData(expectedData);

        // Assert
        Assert.assertEquals(expectedData, node.getData());
    }

}