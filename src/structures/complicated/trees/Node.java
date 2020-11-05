package structures.complicated.trees;

import java.util.List;
import java.util.Optional;

public interface Node<T> {
    Node<T> getParent();

    T getValue();
    void setValue(T value);

    List<Node<T>> getChildren();
    void setChildren(List<? extends Node<T>> children);
}
