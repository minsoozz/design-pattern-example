package proxy;

public class RealSubject implements Subject {

  @Override
  public String doAction() {
    System.out.println("실제 객체 실행");
    return "test";
  }
}
