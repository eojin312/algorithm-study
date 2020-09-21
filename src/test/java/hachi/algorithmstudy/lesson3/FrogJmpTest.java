package hachi.algorithmstudy.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FrogJmpTest {

    @Test
    void solution_기본테스트() {
        FrogJmp frogJmp = new FrogJmp();
        Assertions.assertEquals(3, frogJmp.solution(10, 85, 30));
    }
}