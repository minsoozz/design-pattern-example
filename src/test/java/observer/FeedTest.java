package observer;

import org.junit.jupiter.api.Test;

class FeedTest {

    @Test
    void test() {
        Feed feed = new Feed();
        feed.registerObserver(new NYTimes());
        feed.registerObserver(new Guardian());
        feed.registerObserver(new LeMonde());
        feed.notifyObservers("The queen said her favourite book is Java 8 in Action!");
    }
}