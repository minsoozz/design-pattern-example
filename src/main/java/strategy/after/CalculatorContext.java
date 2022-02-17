package strategy.after;

import java.util.Scanner;

public class CalculatorContext {

    private final CalculatorService calculatorService;

    public CalculatorContext(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double result = calculatorService.logic(number1, number2);

        System.out.println(result);
    }
}
