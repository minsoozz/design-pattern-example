package proxy.before;

import org.junit.jupiter.api.Test;

public class ProxyBeforeTest {

    @Test
    void test() {
        Client client = new Client();
        client.execute();
    }
}
