package proxy.before;

public class Client {

    public void execute() {
        RealSubject realSubject = new RealSubject();
        realSubject.doAction();
    }
}
