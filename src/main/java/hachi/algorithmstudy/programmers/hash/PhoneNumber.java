package hachi.algorithmstudy.programmers.hash;

import java.util.Arrays;

public class PhoneNumber {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        int phoneBookLength = phoneBook.length;
        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBookLength - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
