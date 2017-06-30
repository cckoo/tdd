package calculator.fifth_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/30.
 */
public class StringOperator {

    public static final String DELIMITER = "[,\n]";

    static public Boolean hasDelimiter(String s) {
        return s.matches(".*(" + DELIMITER + ").*");
    }

    private static String[] splitStringWithDelimiter(String s) {
        return s.split(DELIMITER);
    }

    static public int[] getNums(String s) {
        return Arrays.stream(splitStringWithDelimiter(s)).mapToInt(Integer::parseInt).toArray();
    }
}
