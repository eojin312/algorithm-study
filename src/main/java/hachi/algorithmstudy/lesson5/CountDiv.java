package hachi.algorithmstudy.lesson5;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int A, int B, int K); }
 * <p>
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 * <p>
 * { i : A ≤ i ≤ B, i mod K = 0 }
 * <p>
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 *
 * report link : https://app.codility.com/demo/results/training32UAS9-EUY/
 */
public class CountDiv {
    public int solutionTry01(int A, int B, int K) {
        int result = 0;


        if (A % K == 0) {
            result++;
        }
        if (A != B) {
            int ADivisionK = A / K;
            int BDivisionK = B / K;
            result += BDivisionK - ADivisionK;
        }
        return result;
    }
}
