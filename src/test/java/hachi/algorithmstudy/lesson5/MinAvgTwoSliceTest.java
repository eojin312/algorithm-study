package hachi.algorithmstudy.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {

    @Test
    void solution_기본테스트() {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int result = minAvgTwoSlice.solution(A);

        System.out.println(result);
    }

}