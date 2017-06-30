package calculator.fifth_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/30.
 */
public class Calculator {
    public int calculate(String s) {
        if (s.isEmpty())
            return 0;
        if (StringOperator.hasDelimiter(s)) {
            return Arrays.stream(StringOperator.getNums(s)).sum();
        }
        return Integer.parseInt(s);
    }
}
