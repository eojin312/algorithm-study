package hachi.algorithmstudy.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {

    @Test
    void solution_기본테스트() {

        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] A = {3, 8, 9, 7, 6};
        int[] Aexpected = {9, 7, 6, 3, 8};
        Assertions.assertArrayEquals(Aexpected, cyclicRotation.solution(A, 3));

        int[] B = {0, 0, 0};
        int[] Bexpected = {0, 0, 0};
        Assertions.assertArrayEquals(Bexpected, cyclicRotation.solution(B, 1));

        int[] C = {1, 2, 3, 4};
        int[] Cexpected = {1, 2, 3, 4};
        Assertions.assertArrayEquals(Cexpected, cyclicRotation.solution(C, 4));
    }
}