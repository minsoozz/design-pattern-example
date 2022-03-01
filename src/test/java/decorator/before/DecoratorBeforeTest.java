package decorator.before;

import org.junit.jupiter.api.Test;

public class DecoratorBeforeTest {

    @Test
    void test(){
        Component realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }
}
