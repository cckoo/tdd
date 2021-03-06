package calculator.third_day;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/6/27.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void input_empty_string_return_0() {
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void input_string_1__return_1() {
        assertEquals(1, calculator.calculate("1"));
    }

    @Test
    public void input_string_1_comma_2_return_3() {
        assertEquals(3, calculator.calculate("1,2"));
    }

    @Test
    public void input_string_1_newline_2_return_3() {
        assertEquals(3, calculator.calculate("1\n2"));
    }

    @Test
    public void input_string_1_comma_2_newline_3_return_6() {
        assertEquals(6, calculator.calculate("1,2\n3"));
    }
}
