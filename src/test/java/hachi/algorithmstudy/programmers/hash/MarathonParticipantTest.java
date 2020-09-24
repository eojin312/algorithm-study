package hachi.algorithmstudy.programmers.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarathonParticipantTest {

    @Test
    void soltuion_기본테스트() {
        MarathonParticipant marathonParticipant = new MarathonParticipant();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        Assertions.assertEquals("mislav", marathonParticipant.solution(participant, completion));
    }

}