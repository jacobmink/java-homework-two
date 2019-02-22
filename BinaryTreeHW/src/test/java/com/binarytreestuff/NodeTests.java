package com.binarytreestuff;
import static org.junit.Assert.*;
import org.junit.Test;

public class NodeTests {

    @Test
    public void NodeHasPropsAsNull(){
        Node newNode = new Node(5);
        assertNull("Doesn't have left prop as null", newNode.getLeft());
        assertNull("Doesn't have right prop as null", newNode.getRight());
        assertNull("Doesn't have left prop as null", newNode.getLeft());
    }

    @Test
    public void NodeHasData(){
        Node newNode = new Node(5);
        assertEquals("Doesn't have data assigned", 5, newNode.getData());
    }




}
