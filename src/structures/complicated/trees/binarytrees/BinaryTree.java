package structures.complicated.trees.binarytrees;

import structures.complicated.trees.Node;
import structures.complicated.trees.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class BinaryTree<T> implements Tree<T> {
    private BinaryTreeNode root;


    public BinaryTree(T value){
        root = new BinaryTreeNode(value);
    }
    public BinaryTree(BinaryTreeNode root){
        this.root = root;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(T value){
        root = new BinaryTreeNode(value);
    }
    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }
    public void buildTree(){

    }
    public void buildTreeFromArray(T[] array){

    }
    private void buildTree(BinaryTreeNode root){

    }
    //traversals

    public List<T> preOrderTraversal(){
        return preOrderTraversal(root);
    }



    private ArrayList<T> preOrderTraversal(BinaryTreeNode<T> root){
        ArrayList<T> result = new ArrayList<>();
        result.add(root.getValue());
        if(root.getLeftChild() != null){
            result.addAll(preOrderTraversal(root.getLeftChild()));
        }
        if(root.getRightChild() != null){
            result.addAll(preOrderTraversal(root.getRightChild()));
        }
        return result;
    }
    @Override
    public List<T> inOrderTraversal() {
        return inOrderTraversal(root);
    }

    private ArrayList<T> inOrderTraversal(BinaryTreeNode<T> root){
        ArrayList<T> result = new ArrayList<>();

        if(root.getLeftChild() != null){
            result.addAll(preOrderTraversal(root.getLeftChild()));
        }
        result.add(root.getValue());
        if(root.getRightChild() != null){
            result.addAll(preOrderTraversal(root.getRightChild()));
        }
        return result;
    }

}
