package structures;

import structures.complicated.trees.binarytrees.BinaryTree;
import structures.complicated.trees.binarytrees.BinaryTreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(10);
        BinaryTreeNode<Integer>[] nodes = new BinaryTreeNode[4];
        for (int i = 0; i < 2; i++){
            nodes[i] = new BinaryTreeNode<Integer>(i);
        }
        binaryTree.getRoot().setChildren(Arrays.asList(nodes.clone()));
        nodes[0] = new BinaryTreeNode(33);
        nodes[1] = new BinaryTreeNode(55);
        binaryTree.getRoot().getChildren().get(0).setChildren(Arrays.asList(nodes.clone()));
        binaryTree.inOrderTraversal()
                .stream()
                .forEach(System.out::println);
        binaryTree.preOrderTraversal()
                .stream()
                .forEach(System.out::println);
    }
}
