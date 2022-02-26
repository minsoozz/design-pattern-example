package proxy.after;

import org.junit.jupiter.api.Test;

public class ProxyAfterTest {

  @Test
  void test() {
    RealSubject realSubject = new RealSubject();
    Proxy proxy = new Proxy(realSubject);
    Client client = new Client(proxy);
    client.execute();
    client.execute();
    client.execute();
  }
}
