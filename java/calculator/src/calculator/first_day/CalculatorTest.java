package calculator.first_day;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/5/16.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void input_empty_string_return_0() {
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void input_string_1_return_1() {
        assertEquals(1, calculator.calculate("1"));
    }

    @Test
    public void input_string_1_2_return_3() {
        assertEquals(3, calculator.calculate("1,2"));
    }

    @Test
    public void allow_delimiter_is_newline() {
        assertEquals(3, calculator.calculate("1\n2"));
    }

}
