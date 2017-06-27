package calculator.first_day;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by chengwei on 2017/5/16.
 */
public class Calculator {
    private static final String DELIMITER = ",|\n";
    public int calculate(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (isNumbs(s)) {
            return sum(getNumbArray(s.split(DELIMITER)));
        }

        return Integer.parseInt(s);
    }

    private int sum(int[] numbs) {
        return IntStream.of(numbs).sum();
    }

    private int[] getNumbArray(String[] numStrings) {
        return Arrays.stream(numStrings).mapToInt(Integer::parseInt).toArray();
    }

    private boolean isNumbs(String s) {
        return s.matches(".*("+DELIMITER+").*");
    }
}
