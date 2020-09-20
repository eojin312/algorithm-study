package hachi.algorithmstudy.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    public static final int BIG_SIZE = 200000000;

    @Test
    void solution_기본테스트() {
        PermCheck permCheck = new PermCheck();
        int[] A = {4, 1, 3, 2};
        Assertions.assertEquals(1, permCheck.solution(A));

        int[] B = {4, 1, 3};
        Assertions.assertEquals(0, permCheck.solution(B));

        int[] C = new int[BIG_SIZE];
        for (int i = 0; i < BIG_SIZE; i++) {
            C[i] = i+1;
        }
        long start = System.currentTimeMillis();
        Assertions.assertEquals(1, permCheck.solution(C));
        long end = System.currentTimeMillis();
        System.out.println("소요시간 [" + (end - start) + "]");

        int[] D = {1, 1};
        Assertions.assertEquals(0, permCheck.solution(D));
    }
}