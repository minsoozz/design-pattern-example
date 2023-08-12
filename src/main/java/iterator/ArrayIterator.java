package iterator;

public class ArrayIterator implements Iterator {
    private Array array;
    private int index;

    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        index++;
        return index < array.getCount();
    }

    @Override
    public Object current() {
        return array.getItems()[index];
    }
}
