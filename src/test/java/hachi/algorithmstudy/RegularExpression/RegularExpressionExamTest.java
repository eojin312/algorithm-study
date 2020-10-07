package hachi.algorithmstudy.RegularExpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegularExpressionExamTest {

    @Test
    void Pattern클래스_간단한_테스트() {
        RegularExpressionExam regularExpressionExam = new RegularExpressionExam();
        Assertions.assertTrue(regularExpressionExam.patternClassSimpleTest());
    }

    @Test
    void 이름유효성검사_테스트() {
        RegularExpressionExam regularExpressionExam = new RegularExpressionExam();
        Assertions.assertTrue(regularExpressionExam.nameValidation("이어진"));
    }

    @Test
    void 전화번호유효성검사_테스트() {
        RegularExpressionExam regularExpressionExam = new RegularExpressionExam();
        Assertions.assertTrue(regularExpressionExam.telValidation("010-1234-5678"));
    }

    @Test
    void 이메일유효성검사_테스트() {
        RegularExpressionExam regularExpressionExam = new RegularExpressionExam();
        Assertions.assertTrue(regularExpressionExam.emailValidation("eojin312@naver.com"));
    }
}