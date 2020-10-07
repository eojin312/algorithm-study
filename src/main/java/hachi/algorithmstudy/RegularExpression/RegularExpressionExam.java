package hachi.algorithmstudy.RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionExam {
    public boolean patternClassSimpleTest() {
        String pattern = "^[0-9]*$";
        String val = "0123456789";

        boolean regex = Pattern.matches(pattern, val);
        return regex;
    }

    public boolean nameValidation(String name) {
        boolean name_check = Pattern.matches("^[가-힣]*$", name);
        return name_check;
    }

    public boolean telValidation(String tel) {
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
        return tel_check;
    }

    public boolean emailValidation(String email) {
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);
        return email_check;
    }
}
