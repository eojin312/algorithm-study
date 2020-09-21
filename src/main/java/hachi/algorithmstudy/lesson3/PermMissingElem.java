package hachi.algorithmstudy.lesson3;

import java.util.Arrays;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * Your goal is to find that missing element.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A, returns the value of the missing element.
 * For example, given array A such that:
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 * report link = https://app.codility.com/demo/results/trainingFR8D6R-YMG/
 */
public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A); // 오름차순으로 정렬 시켜준다.
        for (int n = 0; n < A.length; n++) {
            if (n + 1 != A[n]) { //N + 1 이 A의 N 번째 값과 다르다면 N + 1 의 값을 리턴한다.
                return n + 1;
            }
        }
        return A.length + 1;
    }
}
