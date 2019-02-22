package com.binarytreestuff;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree recurse(int data, Node currentNode){
            if(data >= currentNode.getData()){
                if(currentNode.getRight() != null){
                    return recurse(data, currentNode.getRight());
                }else{
                    Node newNode = new Node(data);
                    currentNode.setRight(newNode);
                }
            }else if(data < currentNode.getData()){
                if(currentNode.getLeft() != null){
                    return recurse(data, currentNode.getLeft());
                }else{
                    Node newNode = new Node(data);
                    currentNode.setLeft(newNode);
                }
            }
        return this;
    }

    public BinaryTree insertNode(int data){
        if(root == null){
            root = new Node(data);
        }else{
            return recurse(data, root);
        }
        return this;
    }
}
