package calculator.fourth_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/28.
 */
public class Calculator {

    private static final String DELIMITER = ",";

    public int calculate(String s) {
        if (s.isEmpty())
            return 0;

        if (hasContainsDelimiter(s))
            return getSum(getNums(s));

        return Integer.parseInt(s);
    }

    private int getSum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    private int[] getNums(String s) {
        return Arrays.stream(splitStringByDelimiter(s)).mapToInt(Integer::parseInt).toArray();
    }

    private String[] splitStringByDelimiter(String s) {
        return s.split(DELIMITER);
    }

    private boolean hasContainsDelimiter(String s) {
        return s.contains(DELIMITER);
    }
}
