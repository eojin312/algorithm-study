package hachi.algorithmstudy.programmers.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import hachi.algorithmstudy.programmers.hash.MarathonParticipant;

class MarathonParticipantTest {

    @Test
    void test1() {
        MarathonParticipant marathonParticipant = new MarathonParticipant();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};
        Assertions.assertEquals("mislav", marathonParticipant.solution(participant, completion));
    }

    @Test
    void test2() {
        MarathonParticipant marathonParticipant = new MarathonParticipant();
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};
        Assertions.assertEquals("vinko", marathonParticipant.solution(participant, completion));
    }
}