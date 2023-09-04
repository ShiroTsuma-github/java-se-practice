package pl.globallogic.exercises;

public class ex47Node extends ex47ListItem {

    public ex47Node(Object value) {
        super(value);
    }

    @Override
    ex47ListItem next() {
        return this.rightLink;
    }

    @Override
    ex47ListItem setNext(ex47ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ex47ListItem previous() {
        return this.leftLink;
    }

    @Override
    ex47ListItem setPrevious(ex47ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ex47ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
