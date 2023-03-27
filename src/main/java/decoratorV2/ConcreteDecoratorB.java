package decoratorV2;

public class ConcreteDecoratorB implements Component{

    private final Component component;

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        System.out.println("ConcreteDecoratorB 실행");
        return "[ " + component.operation() + " ] ";
    }
}

