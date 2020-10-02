package hachi.algorithmstudy.programmers.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberKTest {

    @Test
    void solution() {
        NumberK numberK = new NumberK();
        Assertions.assertArrayEquals(new int[] { 5, 6, 3 }, numberK.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}