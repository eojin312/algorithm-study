package hachi.algorithmstudy.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinAvgTwoSliceTest {

    @Test
    void solution_기본테스트() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int result = minAvgTwoSlice.solution(A);
        System.out.println(result);
        Assertions.assertEquals(1, minAvgTwoSlice.solution(A));


        int[] B = {-3, -5, -8, -4, -10};
        int result2 = minAvgTwoSlice.solution(B);
        System.out.println(result2);
        Assertions.assertEquals(2, minAvgTwoSlice.solution(B));
    }

    @Test
    void solution_기본테스트2() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int result = minAvgTwoSlice.solution(A);
        System.out.println(result);
    }

}