package structures.complicated.trees;

import java.util.ArrayList;
import java.util.List;

public interface Tree<T> {
    Node<T> getRoot();
    List<T> preOrderTraversal();
    List<T> inOrderTraversal();
}
