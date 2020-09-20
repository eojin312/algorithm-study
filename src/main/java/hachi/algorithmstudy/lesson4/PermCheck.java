package hachi.algorithmstudy.lesson4;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {

        Arrays.sort(A);


        final int ALength = A.length;
        for (int i = 1; i <= ALength; i++) {
            if (A[i-1] != i) return 0; // is not a permutation
        }
        return 1; // is a permutation
    }
}
