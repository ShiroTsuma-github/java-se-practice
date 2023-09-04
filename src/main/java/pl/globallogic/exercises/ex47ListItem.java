package pl.globallogic.exercises;

public abstract class ex47ListItem {
    protected ex47ListItem rightLink = null;
    protected ex47ListItem leftLink = null;

    protected Object value;

    public ex47ListItem(Object value) {
        this.value = value;
    }

    abstract ex47ListItem next();
    abstract ex47ListItem setNext(ex47ListItem item);
    abstract ex47ListItem previous();
    abstract ex47ListItem setPrevious(ex47ListItem item);

    abstract int compareTo(ex47ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}