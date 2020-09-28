package hachi.algorithmstudy.programmers.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StockPriceTest {

    @Test
    void solution() {
        StockPrice stockPrice = new StockPrice();
        int[] A = {1, 2, 3, 2, 3};
        int[] result = stockPrice.solution(A);
        int[] expected = {4, 3, 1, 1, 0};
        Assertions.assertArrayEquals(expected, result);
    }
}