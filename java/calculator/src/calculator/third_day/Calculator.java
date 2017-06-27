package calculator.third_day;

/**
 * Created by chengwei on 2017/6/27.
 */
public class Calculator {
    public int calculate(String s) {
        if (s.isEmpty())
            return 0;
        return Integer.parseInt(s);
    }
}
