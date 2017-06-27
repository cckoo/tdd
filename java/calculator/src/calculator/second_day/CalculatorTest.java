package calculator.second_day;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/6/22.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void input_empty_string_return_0() {
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void input_string_1_return_int_1() {
        assertEquals(1, calculator.calculate("1"));
    }

    @Test
    public void input_string_with_comma_delimiter_return_sum() {
        assertEquals(3, calculator.calculate("1,2"));
    }

    @Test
    public void input_string_with_newline_delimiter_return_sum() {
        assertEquals(3, calculator.calculate("1\n2"));
    }

    @Test
    public void define_self_delimiter() {
        assertEquals(6, calculator.calculate("//;\n1;2,3"));
    }
}
