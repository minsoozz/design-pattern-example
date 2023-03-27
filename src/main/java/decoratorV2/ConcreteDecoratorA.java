package decoratorV2;

public class ConcreteDecoratorA implements Component {

    private final Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        System.out.println("ConcreteDecoratorA 실행");
        return " +++ " + component.operation() + " +++ ";
    }
}
