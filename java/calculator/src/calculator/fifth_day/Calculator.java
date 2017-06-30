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
            int[] nums = Arrays.stream(StringOperator.splitStringWithDelimiter(s)).mapToInt(Integer::parseInt).toArray();
            return Arrays.stream(nums).sum();
        }
        return Integer.parseInt(s);
    }
}
