package strategy.before;

import org.junit.jupiter.api.Test;

public class StrategyBeforeTest {

  @Test
  void test() {
    Calculator calculator = new Calculator();

    double number1 = 10;
    double number2 = 21;
    double result = 0d;
    String operator = "-";

    if ("+".equals(operator)) {
      result = calculator.plus(number1, number2);
    } else if ("-".equals(operator)) {
      result = calculator.minus(number1, number2);
    } else if ("*".equals(operator)) {
      result = calculator.multiply(number1, number2);
    } else if ("/".equals(operator)) {
      result = calculator.division(number1, number2);
    }
    System.out.println(result);
  }
}
