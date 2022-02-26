package proxy.after;

public class Client {

  Subject subject;

  public Client(Subject subject) {
    this.subject = subject;
  }

  public void execute() {
    subject.doAction();
  }
}
