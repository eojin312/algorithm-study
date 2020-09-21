package hachi.algorithmstudy.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermMissingElemTest {

    @Test
    void solution_기본테스트() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = {2, 3, 1, 5};
        Assertions.assertEquals(4, permMissingElem.solution(A));

        int[] B = {1000, 1001, 1002, 1005};
        Assertions.assertEquals(1, permMissingElem.solution(B));
    }
}