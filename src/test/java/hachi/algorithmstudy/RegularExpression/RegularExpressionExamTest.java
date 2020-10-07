package hachi.algorithmstudy.RegularExpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegularExpressionExamTest {

    @Test
    void Pattern클래스_간단한_테스트() {
        RegularExpressionExam regularExpressionExam = new RegularExpressionExam();
        Assertions.assertTrue(regularExpressionExam.patternClassSimpleTest());
    }
}