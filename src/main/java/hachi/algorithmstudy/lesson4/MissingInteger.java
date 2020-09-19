package hachi.algorithmstudy.lesson4;

import java.util.*;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 * report link : https://app.codility.com/demo/results/trainingAKT8UP-VZ6/
 */
public class MissingInteger {
    /**
     * sample예제는 무난히 통과했으나 [2]인 경우 3이 리턴되어 테스트 실패.
     * 다양한 케이스를 모두 if문처리를 해야해서 더 코딩안하고 포기..
     * 기본적인 아이디어는
     * 1. 중복제거
     * 2. 정렬한다.
     * 3. 연속성 유무를 따져서 연속되지않음이 발견되면 고녀석이 빠진숫자라고 판단.
     * @param A
     * @return
     */
    public int solutionTry01(int[] A) {
        int missingNumber = 1;
        Set<Integer> set = new HashSet();
        // 1. 중복제거한다.
        for (int i : A) {
            set.add(i);
        }
        // 2. 정렬한다.
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);

        // 3. 연속 여부를 따져서 빠진 숫자를 찾는다.
        boolean isFoundedMissingNumber = false;

        int size = list.size();
        for (int i = 1; i < size; i++) {
            if (list.get(i) <= 0) {
                continue;
            }
            if (list.get(i) - list.get(i - 1) == 1) {
                // 연속된 숫자가 맞다.

            } else {
                // 연속된 숫자가 아니다. 현재 숫자에서 -1 하면 빠진숫자다.
                isFoundedMissingNumber = true;
                missingNumber = list.get(i) - 1;
            }
        }

        // 4. 분명 빠진 숫자가 발견되야하는데 없다면
        if (isFoundedMissingNumber == false) {
            int endNumber = list.get(list.size()-1);
            if (endNumber <= 0) { // 줄 세우는 녀석들 중 마지막이 모두 0이하면 그냥 무조건 1을 리턴해야한다.
                return 1;
            } else { // 이 경우가 sample의 1,2,3케이스이다.
                return endNumber + 1;
            }
        }
        return missingNumber;
    }

    public int solution(int[] A) {
        Set<Integer> set = new HashSet();
        // 1. 중복제거한다.
        for (int i : A) {
            set.add(i);
        }

        // 1부터 21억까지 돌면서 있냐 없냐를 확인해서 없으면 retrun
        // 최악의 경우 21억번 돌수있지만 이게 가장 효율적
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (set.contains(i) == false) {
                return i;
            }
        }
        return 1;
    }
}
