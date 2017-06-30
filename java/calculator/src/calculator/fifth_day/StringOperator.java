package calculator.fifth_day;

/**
 * Created by chengwei on 2017/6/30.
 */
public class StringOperator {
    static public Boolean hasDelimiter(String s) {
        return s.contains(",");
    }

    static public String[] splitStringWithDelimiter(String s) {
        return s.split(",");
    }
}
