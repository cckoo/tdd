package calculator.fourth_day;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/6/28.
 */
public class CalculatorTest {
    @Test
    public void input_empty_string_return_0() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void input_string_1_return_1() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.calculate("1"));
    }
}
