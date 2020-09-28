package hachi.algorithmstudy.programmers.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopFuncTest {

    @Test
    void solution() {
        DevelopFunc developFunc = new DevelopFunc();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] actual = developFunc.solution(progresses, speeds);
        int[] expected = {2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void solution2() {
        DevelopFunc developFunc = new DevelopFunc();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] actual = developFunc.solution(progresses, speeds);
        int[] expected = {1, 3, 2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void solution3() {
        DevelopFunc developFunc = new DevelopFunc();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] actual = developFunc.solution2(progresses, speeds);
        int[] expected = {1, 3, 2};
        Assertions.assertArrayEquals(expected, actual);
    }
}