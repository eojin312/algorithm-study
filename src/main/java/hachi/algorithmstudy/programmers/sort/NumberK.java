package hachi.algorithmstudy.programmers.sort;

import java.util.Arrays;

public class NumberK {
    public int[] solution(int[] array, int[][] commands) {
        final int CLength = commands.length;
        int[] answer = new int[CLength];

        for (int i = 0; i < CLength; i++) {
            int[] command = commands[i];
            int[] splitArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(splitArray);
            answer[i] = splitArray[command[2] - 1];
        }
        return answer;
    }
}
