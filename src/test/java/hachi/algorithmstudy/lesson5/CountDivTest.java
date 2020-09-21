package hachi.algorithmstudy.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    void solutionTry01() {
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solutionTry01(6, 11, 2));
        Assertions.assertEquals(3, countDiv.solutionTry01(6, 11, 2));
        Assertions.assertEquals(1, countDiv.solutionTry01(0, 1, 11));
        Assertions.assertEquals(1, countDiv.solutionTry01(10, 10, 5));
        Assertions.assertEquals(0, countDiv.solutionTry01(10, 10, 7));
    }
}