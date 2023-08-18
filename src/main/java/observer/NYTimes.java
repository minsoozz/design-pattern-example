package observer;

public class NYTimes implements Observer {
    @Override
    public void notify(String message) {
        if (message != null && message.contains("money")) {
            System.out.println("Breaking news in NY! " + message);
        }
    }
}
