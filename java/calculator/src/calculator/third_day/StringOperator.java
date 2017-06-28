package calculator.third_day;

import java.util.Arrays;

/**
 * Created by chengwei on 2017/6/28.
 */
public class StringOperator {

    private static final String DELIMITER = ",";

    static public int[] getNums(String s) {
        return Arrays.stream(splitStringByDelimiter(s)).mapToInt(Integer::parseInt).toArray();
    }

    static public String[] splitStringByDelimiter(String s) {
        return s.split(DELIMITER);
    }
}
