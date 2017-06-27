package calculator.third_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/27.
 */
public class Calculator {
    private String[] delimiters;

    public Calculator() {
        delimiters = new String[]{",", "\n"};
    }

    public int calculate(String s) {
        if (s.isEmpty())
            return 0;

        if (isContainDelimiter(s))
            return getSumWithDelimiter(s);

        return Integer.parseInt(s);
    }

    private String getDelimiter() {
        return "[" + Arrays.toString(delimiters) + "]";
    }

    private boolean isContainDelimiter(String s) {
        return s.matches(".*(" + getDelimiter() + ").*");
    }

    private int getSumWithDelimiter(String s) {
        return Arrays.stream(getIntegerArrayBy(splitStringToStringArray(s))).sum();
    }

    private int[] getIntegerArrayBy(String[] stringArray) {
        return Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
    }

    private String[] splitStringToStringArray(String s) {
        return s.split(getDelimiter());
    }

}
