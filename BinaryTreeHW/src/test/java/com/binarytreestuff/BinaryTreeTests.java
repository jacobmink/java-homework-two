package com.binarytreestuff;
import static org.junit.Assert.*;
import org.junit.Test;


public class BinaryTreeTests {

    @Test
    public void InsertLowerDataNodeToLeft(){
        BinaryTree newTree = new BinaryTree();
        newTree.insertNode(5);
        newTree.insertNode(3);
        assertEquals("Does not put node(3) left", 3, newTree.getRoot().getLeft().getData());
    }

    @Test
    public void InsertAtProperPlace(){
        BinaryTree newTree = new BinaryTree();
        newTree.insertNode(10);
        assertEquals("Did not place Node(10) at root", 10, newTree.getRoot().getData());
        newTree.insertNode(3).insertNode(12).insertNode(2).insertNode(9).insertNode(7).insertNode(16);
        assertEquals("Did not place Node(16) right of Node(12)", 16, newTree.getRoot().getRight().getRight().getData());
    }
}
