package strategy.after;

public class CalculatorContext {

  private CalculatorStrategy calculatorStrategy;

  public CalculatorContext(CalculatorStrategy calculatorStrategy) {
    this.calculatorStrategy = calculatorStrategy;
  }

  public void execute(double number1, double number2) {

    double result = calculatorStrategy.logic(number1, number2);

    System.out.println(result);
  }
}
