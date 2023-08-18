package observer;

public class Guardian implements Observer {
    @Override
    public void notify(String message) {
        if (message != null && message.contains("queen")) {
            System.out.println("Yet more news from London... " + message);
        }
    }
}
