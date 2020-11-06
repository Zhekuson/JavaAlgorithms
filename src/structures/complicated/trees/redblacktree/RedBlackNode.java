package structures.complicated.trees.redblacktree;

import structures.complicated.trees.Node;

import java.util.List;

public class RedBlackNode<T extends Comparable<T>> implements Node<T> {
    private T value;
    public final int RED = 0;
    public final int BLACK = 0;
    @Override
    public Node<T> getParent() {
        return null;
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public void setValue(T value) {

    }

    @Override
    public List<Node<T>> getChildren() {
        return null;
    }

    @Override
    public void setChildren(List<? extends Node<T>> children) {

    }
}
