package proxy.before;

public class RealSubject implements Subject {
    @Override
    public String doAction() {
        System.out.println("실제 객체 실행");
        sleep(1000);
        return "test";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
