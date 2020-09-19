package hachi.algorithmstudy.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class MaxCountersTest {
    public static final int BIG_SIZE = 200000000;

    @Test
    void solutionTry01_기본테스트() {
        MaxCounters maxCounters = new MaxCounters();
        int[] actual = maxCounters.solutionTry01(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        int[] expected = {3, 2, 2, 4, 2};
        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void solution_기본테스트() {
        MaxCounters maxCounters = new MaxCounters();
        int[] actual = maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        int[] expected = {3, 2, 2, 4, 2};
        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void solutionTry01_대량입력테스트() {
        MaxCounters maxCounters = new MaxCounters();
        int N = BIG_SIZE;
        int[] A = new int[BIG_SIZE];
        Random rand = new Random();
        for (int i = 0; i < BIG_SIZE; i++) {
            int randomValue = rand.nextInt(N);
            int value = randomValue + 1;
            A[i] = value;
        }
        System.out.println("==== solution start ====");
        long start = System.currentTimeMillis();
        int[] actual = maxCounters.solutionTry01(N, A);
        long end = System.currentTimeMillis();
        System.out.println("==== solution end ====" + ((end-start)));

        // 결과 : BIG_SIZE가 200000000 일때 -> 12236 ms
    }

    @Test
    void solution_대량입력테스트() {
        MaxCounters maxCounters = new MaxCounters();
        int N = BIG_SIZE;
        int[] A = new int[BIG_SIZE];
        Random random = new Random();
        System.out.println("==== random setting start====");
        for (int i = 0; i < BIG_SIZE; i++) {
            int randomValue = random.nextInt(N);
            int value = randomValue + 1;
            A[i] = value;
        }
        System.out.println("==== random setting end====");

        System.out.println("==== solution start ====");
        long start = System.currentTimeMillis();
        int[] actual = maxCounters.solution(N, A);
        long end = System.currentTimeMillis();
        System.out.println("==== solution end ====" + ((end-start)));

        // 결과 : BIG_SIZE가 200000000 일때 -> 8385 (솔루션01은 12236 였음)

        // 12236
        //  8385
    }
}