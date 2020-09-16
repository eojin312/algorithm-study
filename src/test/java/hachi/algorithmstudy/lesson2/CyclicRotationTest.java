package hachi.algorithmstudy.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int remainder = (i + K) % A.length;
            result[remainder] = A[i];
        }
        return result;
    }

    @Test
    void solution() {
        int[] A = {1, 2, 3, 4};
        int[] expected = solution(A, 4);

        System.out.println(Arrays.toString(expected));

    }
}