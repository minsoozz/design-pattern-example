package decoratorV2.before;

import decoratorV2.Component;
import decoratorV2.DecoratorClient;
import decoratorV2.RealComponent;
import org.junit.jupiter.api.Test;

class DecoratorBeforeTest {

    @Test
    void test() {
        Component component = new RealComponent();
        DecoratorClient decoratorClient = new DecoratorClient(component);
        decoratorClient.execute();
    }
}