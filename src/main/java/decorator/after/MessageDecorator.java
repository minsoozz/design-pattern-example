package decorator.after;

public class MessageDecorator implements Component {

    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        System.out.println("MessageDecorator 실행");
        String result = component.operation();
        String decoratorResult = "*****" + result + "*****";
        System.out.println("MessageDecorator 꾸미기 적용전 = " + result + " 적용 후 = " + decoratorResult);
        return decoratorResult;
    }
}
