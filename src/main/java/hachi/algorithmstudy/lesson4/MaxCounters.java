package hachi.algorithmstudy.lesson4;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the values of the counters after each consecutive operation will be:
 *
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int N, int[] A); }
 *
 * that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 *
 * Result array should be returned as an array of integers.
 *
 * For example, given:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the function should return [3, 2, 2, 4, 2], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N and M are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..N + 1].
 *
 * report link : https://app.codility.com/demo/results/trainingZW9DND-5PY/
 *
 */
public class MaxCounters {

    /**
     * O(n^2)
     *
     * @param N
     * @param A
     * @return
     */
    public int[] solutionTry01(int N, int[] A) {

        // counter들의 count를 저장하는 배열
        int[] counterArray = new int[N];

        // 현재까지 count 중 가장 큰 count
        int maxCount = 0;

        final int length = A.length;

        for (int i = 0; i < length; i++) {
            // N+1 케이스
            if (A[i] > N) {
                // 지금까지 count중 가장 큰 count로 모든 count를 업데이트한다.
                for (int j = 0; j < N; j++) {
                    counterArray[j] = maxCount;
                }
            } else {
                // if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X)
                int index = A[i] - 1;
                counterArray[index]++;

                // 방금 count 올린 수와 지금까지 가장 큰 count인 maxCount와 비교해서 더 큰 녀석을 maxCount로 갱신한다.
                maxCount = Math.max(maxCount, counterArray[index]);
            }
        }
        return counterArray;
    }

    /**
     * O(2n)
     *
     * @param N
     * @param A
     * @return
     */
    public int[] solution(final int N, int[] A) {

        // counter 별로 count 를 저장한다.
        // 1번 카운터(A[k]==1)는 counterArray[0]
        // 4번 카운터(A[k]==4)는 counterArray[3]
        int[] counterArray = new int[N];

        // 현재까지 가장 큰 count
        int maxCount = 0;

        // 마지막 N+1 일때 시점의 maxCount
        int tempMaxCount = 0;

        // A 배열을 돌면서 조건에 맞는 increase 혹은 N + 1 일 때 지금까지 가장 큰 count 로 모두 통일시킴 (단, N + 1 일 때는 통일만 되지 개별 count 가 올라가지않는다)
        // 단, 이중 루프를 피하기 위해서 해당 counter 가 increase 될 때 N + 1 일 때 해야될 일을 그때그때 수행해준다.
        // 그리고 누락된 counter 들은 별도 루프로 처리해준다.
        for (int X : A) {
            // if A[K] = N + 1 then operation K is max counter.
            if (X == N + 1) {
                tempMaxCount = maxCount;
            } else if (X >= 1 && X <= N) { // if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
                int index = X - 1;

                // N + 1 때 실행 안했던 maxCount 로 set 시킨다.
                if (counterArray[index] < tempMaxCount) { // 이미 maxCount 녀석이 아니었던 경우에 한에서
                    counterArray[index] = tempMaxCount;
                }
                counterArray[index]++;  // increase(X)

                // 현재 count 가 올라갔던 녀석하고 이전 maxCount 와 비교해서 큰 놈을 maxCount 로 갱신해준다.
                maxCount = Math.max(maxCount, counterArray[index]);
            } else { // 그 외에 모든 케이스는 잘못된 입력값
                throw new IllegalArgumentException();
            }
        }

        // N+1때 마지막 maxCount로 모두 통일해야하는데, 위 for문에서는 별도로 통일시키지 않고 counter로 increase되는게 선정된 카운터만 increase되면서 maxCount를 적용하게 된다
        // 선정되지않은 counter 는 maxCount 로 조정될 기회마저 없다.
        // counterArray 를 최종으로 돌면서 누락된 아이들을 마저 maxCount 로 set 해준다.
        for (int i = 0; i < N; i++) {
            if (counterArray[i] < tempMaxCount) {
                counterArray[i] = tempMaxCount;
            }
        }
        return counterArray;
    }


}
