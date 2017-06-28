package calculator.fourth_day;

import calculator.third_day.StringOperator;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/28.
 */
public class Calculator {

    public int calculate(String s) {
        if (s.isEmpty())
            return 0;

        if (StringOperator.hasContainsDelimiter(s))
            return getSum(StringOperator.getNums(s));

        return StringOperator.getNumWithStringNum(s);
    }

    private int getSum(int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
