package strategy.after;

public class DivisionCalculator implements CalculatorStrategy {

  @Override
  public double logic(double number1, double number2) {
    return number1 / number2;
  }
}
