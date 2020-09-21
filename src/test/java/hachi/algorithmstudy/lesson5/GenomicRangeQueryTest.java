package hachi.algorithmstudy.lesson5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {

    @Test
    void solution_기본테스트() {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expected = {2, 4, 1};
        assertArrayEquals(expected, genomicRangeQuery.solution("CAGCCTA", P, Q));
    }

}