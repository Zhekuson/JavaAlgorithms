package structures.complicated.trees.binarytrees;

import structures.complicated.trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinaryTreeNode<T> implements Node<T> {
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;
    private BinaryTreeNode<T> parent;
    private T value;


    public BinaryTreeNode(T value){
        this.value = value;
    }
    public BinaryTreeNode(T value, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild){
        this(value);
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    public BinaryTreeNode(T value, BinaryTreeNode<T> parent){
        this(value);
        this.parent = parent;
    }


    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value){
        this.value = value;
    }

    @Override
    public Node<T> getParent() {
        return parent;
    }




    @Override
    public List<Node<T>> getChildren() {
        ArrayList<Node<T>> result = new ArrayList<Node<T>>();
        result.add(leftChild);
        result.add(rightChild);
        return result;
    }

    @Override
    public void setChildren(List<? extends Node<T>> children) throws IllegalArgumentException{
        if(children.size() < 1){
            throw new IllegalArgumentException("list of children size < 1");
        }
        else if(children.size() == 1){
            leftChild = (BinaryTreeNode<T>) children.get(0);
        }else{
            leftChild = (BinaryTreeNode<T>) children.get(0);
            rightChild = (BinaryTreeNode<T>) children.get(1);
        }
    }
}
