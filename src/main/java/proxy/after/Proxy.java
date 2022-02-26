package proxy.after;

public class Proxy implements Subject {

  private Subject subject;
  private String value;

  public Proxy(Subject subject) {
    this.subject = subject;
  }

  @Override
  public String doAction() {

    System.out.println("프록시 실행");

    if (value == null) {
      value = subject.doAction();
    }

    return value;
  }
}
