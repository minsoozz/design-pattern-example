package iterator;

public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
}
