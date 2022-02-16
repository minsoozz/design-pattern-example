package strategy.before;

import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    double number1 = scanner.nextDouble();
    String operator = scanner.next();
    double number2 = scanner.nextDouble();
    double result = 0d;

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
