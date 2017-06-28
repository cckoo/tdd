package calculator.third_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/28.
 */
public class StringOperator {

    private static final String DELIMITER = "[,\n]";

    static public int[] getNums(String s) {
        return Arrays.stream(splitStringByDelimiter(s)).mapToInt(Integer::parseInt).toArray();
    }

    private static String[] splitStringByDelimiter(String s) {
        return s.split(DELIMITER);
    }

    static public boolean hasContainsDelimiter(String s) {
        return s.matches(".*(" + DELIMITER + ").*");
    }

    static public int getNumWithStringNum(String num) {
        return Integer.parseInt(num);
    }
}
