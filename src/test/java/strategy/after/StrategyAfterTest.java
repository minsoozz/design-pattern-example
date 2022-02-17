package strategy.after;

import org.junit.jupiter.api.Test;

public class StrategyAfterTest {

    @Test
    void test() {

        PlusCalculator plusCalculator = new PlusCalculator();

        CalculatorContext calculatorContext = new CalculatorContext(plusCalculator);

    }
}
