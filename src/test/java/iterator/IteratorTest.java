package iterator;

import org.junit.jupiter.api.Test;

class IteratorTest {

    @Test
    void test() {
        Item[] items = new Item[3];
        items[0] = new Item("Item 1", 100);
        items[1] = new Item("Item 2", 200);
        items[2] = new Item("Item 3", 300);

        Array array = new Array(items);
        Iterator iterator = array.createIterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.current();
            System.out.println(item.toString());
        }
    }
}