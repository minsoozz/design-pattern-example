package observer;

public class LeMonde implements Observer {
    @Override
    public void notify(String message) {
        if (message != null && message.contains("wine")) {
            System.out.println("Today cheese, wine and news! " + message);
        }
    }
}
