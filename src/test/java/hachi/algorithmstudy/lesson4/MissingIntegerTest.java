package hachi.algorithmstudy.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingIntegerTest {

    @Test
    void solution_기본테스트() {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = {1, 3, 6, 4, 1, 2};
        Assertions.assertEquals(5, missingInteger.solutionTry01(A));

        int[] B = {1, 2, 3};
        Assertions.assertEquals(4, missingInteger.solutionTry01(B));

        int[] C = {-1, -3};
        Assertions.assertEquals(1, missingInteger.solutionTry01(C));

        int[] D = {2};
        Assertions.assertEquals(1, missingInteger.solutionTry01(D));

        int[] E = {1};
        Assertions.assertEquals(2, missingInteger.solutionTry01(E));

        int[] F = {90, 91, 92, 93};
        Assertions.assertEquals(1, missingInteger.solutionTry01(F));
    }

    @Test
    void solution_기본테스트02() {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = {1, 3, 6, 4, 1, 2};
        Assertions.assertEquals(5, missingInteger.solution(A));

        int[] B = {1, 2, 3};
        Assertions.assertEquals(4, missingInteger.solution(B));

        int[] C = {-1, -3};
        Assertions.assertEquals(1, missingInteger.solution(C));

        int[] D = {2};
        Assertions.assertEquals(1, missingInteger.solution(D));

        int[] E = {1};
        Assertions.assertEquals(2, missingInteger.solution(E));

        int[] F = {90, 91, 92, 93};
        Assertions.assertEquals(1, missingInteger.solution(F));
    }
}