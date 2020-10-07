package hachi.algorithmstudy.RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionExam {
    public boolean patternClassSimpleTest() {
        String pattern = "^[0-9]*$";
        String val = "0123456789";

        boolean regex = Pattern.matches(pattern, val);
        return regex;
    }
}
