package strategy.after;

import org.junit.jupiter.api.Test;

public class StrategyAfterTest {

  @Test
  void test() {

    CalculatorContext calculatorContext1 = new CalculatorContext(new PlusCalculator());
    calculatorContext1.execute(1, 2);

    CalculatorContext calculatorContext2 = new CalculatorContext(new CalculatorStrategy() {
      @Override
      public double logic(double number1, double number2) {
        return number1 - number2;
      }
    });
    calculatorContext2.execute(2, 1);

    CalculatorContext calculatorContext3 = new CalculatorContext((number1, number2) -> number1 / number2);
    calculatorContext3.execute(10, 2);
  }


}
