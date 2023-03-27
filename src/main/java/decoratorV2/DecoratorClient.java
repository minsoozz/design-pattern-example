package decoratorV2;

public class DecoratorClient {

    private final Component component;

    public DecoratorClient(Component component) {
        this.component = component;
    }

    public void execute() {
        String result = component.operation();
        System.out.println("result = {+" + result + "+}");
    }
}

