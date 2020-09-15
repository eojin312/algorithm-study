package hachi.algorithmstudy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    public int solution(int N) {
        String binaryInteger = Integer.toBinaryString(N);
        int binaryIntegerLength = binaryInteger.length();
        int zeroCount = 0;
        int maxCount = 0;
        for (int i = 0; i < binaryIntegerLength; i++) {
            if (binaryInteger.charAt(i) == '1') {
                maxCount = Math.max(maxCount, zeroCount); // 둘이 비교해서 가장 큰 놈을 maxcount 에 담아준다.
                zeroCount = 0;
            } else {
                zeroCount++;
            }
        }
        return maxCount;
    }

    @Test
    void solutionTest() {
        int expect = solution(200);
        int acutal = 2;
        Assertions.assertEquals(acutal, expect);
    }
}