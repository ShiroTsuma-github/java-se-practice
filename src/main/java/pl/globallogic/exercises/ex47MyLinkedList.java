package pl.globallogic.exercises;

public class ex47MyLinkedList implements ex47NodeList {

    private ex47ListItem root = null;

    public ex47MyLinkedList(ex47ListItem root) {
        this.root = root;
    }

    @Override
    public ex47ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ex47ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }

        ex47ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }
        }
    return false;
    }

    @Override
    public boolean removeItem(ex47ListItem item) {
        return false;
    }

    @Override
    public void traverse(ex47ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
