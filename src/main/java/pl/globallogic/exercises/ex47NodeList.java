package pl.globallogic.exercises;

public interface ex47NodeList {
    ex47ListItem getRoot();
    boolean addItem(ex47ListItem item);
    boolean removeItem(ex47ListItem item);
    void traverse(ex47ListItem root);
}
