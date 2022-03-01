package decorator.after;

public class TimeDecorator implements Component {

    private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        System.out.println("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();
        String result = component.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime = startTime;
        System.out.println("TimeDecorator 종료 realTime = " + resultTime + "ms");
        return result;
    }
}
