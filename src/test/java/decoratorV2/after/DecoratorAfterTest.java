package decoratorV2.after;

import decoratorV2.Component;
import decoratorV2.ConcreteDecoratorA;
import decoratorV2.ConcreteDecoratorB;
import decoratorV2.DecoratorClient;
import decoratorV2.RealComponent;
import org.junit.jupiter.api.Test;

class DecoratorAfterTest {

    @Test
    void test() {
        Component component = new RealComponent();
        Component componentA = new ConcreteDecoratorA(component);
        Component componentB = new ConcreteDecoratorB(componentA);
        DecoratorClient decoratorClient = new DecoratorClient(componentB);
        decoratorClient.execute();
    }
}