package calculator.second_day;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chengwei on 2017/6/22.
 */
public class Calculator {
    private String delimiter = ",|\n";
    private String pattern = "//(.+)\n";

    public int calculate(String s) {
        if (s.isEmpty())
            return 0;

        if (hasSelfDefineDelimiter(s)) {
            addDelimiter(getSelfDefineDelimiter(s));
            s = s.replaceAll(pattern, "");
        }

        if (hasDelimiter(s)) {
            return getSumByDelimiter(s);
        }
        return Integer.parseInt(s);
    }

    private boolean hasSelfDefineDelimiter(String s) {
        return s.matches("//.+\n.*");
    }

    private boolean hasDelimiter(String s) {
        return s.matches(".*(" + getDelimiter() + ").*");
    }

    private int getSumByDelimiter(String s) {
        return Arrays.stream(getNumsByStrings(splitString(s))).sum();
    }

    private String[] splitString(String s) {
        return s.split(getDelimiter());
    }

    private int[] getNumsByStrings(String[] stringNums) {
        return Arrays.stream(stringNums).mapToInt(Integer::parseInt).toArray();
    }

    private String getDelimiter() {
        return delimiter;
    }

    private void addDelimiter(String s) {
        delimiter += "|" + s;
    }

    private String getSelfDefineDelimiter(String s) {
        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(s);

        if (m.find()) {
            return m.group(1);
        }
        return "";
    }
}
