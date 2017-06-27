package calculator.third_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/27.
 */
public class Calculator {
    private static final String DELIMITER = ",";
    public int calculate(String s) {
        if (s.isEmpty())
            return 0;

        if (s.contains(DELIMITER))
            return getSumWithDelimiter(s);

        return Integer.parseInt(s);
    }

    private int getSumWithDelimiter(String s) {
        return Arrays.stream(getIntegerArrayBy(splitStringToStringArray(s))).sum();
    }

    private int[] getIntegerArrayBy(String[] stringArray) {
        return Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
    }

    private String[] splitStringToStringArray(String s) {
        return s.split(DELIMITER);
    }

}
