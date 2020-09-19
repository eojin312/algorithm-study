package hachi.algorithmstudy.lesson3;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * For example, consider array A such that:
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 * For example, given:
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 *
 * report link : https://app.codility.com/demo/results/trainingVBASWX-ND8/
 */
public class TapeEquilibrium {
    /**
     * O(2n^2)
     * @param A
     * @return
     */
    public int solutionTry01(int[] A) {
        int N = A.length;
        int minDifference = Integer.MAX_VALUE;

        //
        for (int P = 1; P < N; P++) {
            long sumFirstPart = 0;
            for (int i = 0; i <= P - 1; i++) {
                sumFirstPart += A[i];
            }
            long sumSecondPart = 0;
            for (int j = P; j <= N - 1; j++) {
                sumSecondPart += A[j];
            }
            int difference = (int) Math.abs(sumFirstPart - sumSecondPart);
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }

    /**
     * O(3n)
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int ALength = A.length;
        if (ALength == 2) {
            return A[1] - A[0];
        }
        int N = A.length;
        long total = 0;
        long sumFirstPart = 0;
        int minDifference = Integer.MAX_VALUE;
        long sumSecondPart = 0;

        // 전체 누적합을 구한다
        for (int i = 0; i < N; i++) {
            total += A[i];
        }

        // P를 index로 갖는 누적합 배열에 계산값을 담는다
        int sumFirstPartArray[] = new int[N];
        sumFirstPartArray[0] = 0;

        /*
        sumFirstPartArray[1] = 1-1까지 누적합 = A[0]
        sumFirstPartArray[2] = 2-1까지 누적합 = sumFirstPartArray[1] + A[1] = A[0] + A[1]
        sumFirstPartArray[3] = 3-1까지 누적합 = sumFirstPartArray[2] + A[2] = A[0] + A[1] + A[3]
         */
         for (int P = 1; P < N; P++ ) {
            if (P == 1) {
                sumFirstPartArray[P-1] = A[0];
            }
            sumFirstPartArray[P] = sumFirstPartArray[P-1] + A[P];
        }

        for (int P = 0; P < N-1; P++ ) {
            // 두번째파트누적합 = 전체누적합 - 첫번째파트누적합[P];
            // 차 = |첫번째파트누적합[P] - 두번째파트누적합|
            // minDifference = Math.min(minDifference, difference);
            sumSecondPart = total - sumFirstPartArray[P];
            int difference = (int) Math.abs(sumFirstPartArray[P] - sumSecondPart);
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }
}
