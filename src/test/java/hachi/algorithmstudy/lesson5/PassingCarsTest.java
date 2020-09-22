package hachi.algorithmstudy.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    @Test
    void solution_기본테스트() {
        PassingCars passingCars = new PassingCars();
        int[] A = {0, 1, 0, 1, 1};
        Assertions.assertEquals(5, passingCars.solution(A));

        int[] B = {1};
        System.out.println(passingCars.solution(B));
        /*Assertions.assertEquals(5, passingCars.solution(B));*/
    }

}