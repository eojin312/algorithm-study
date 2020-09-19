package hachi.algorithmstudy.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

    public static final int BIG_SIZE = 200000000;

    @Test
    void 기본값테스트() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = {3, 1, 2, 4, 3};
        Assertions.assertEquals(1, tapeEquilibrium.solution(A));

        int[] B = {1, 1, 3};
        Assertions.assertEquals(1, tapeEquilibrium.solution(B));

        int[] C = {1, 1};
        Assertions.assertEquals(0, tapeEquilibrium.solution(C));

        int[] D = {3, 1, 1};
        Assertions.assertEquals(1, tapeEquilibrium.solution(D));

        int[] E = {-10, -20, -30, -40, 100};
        Assertions.assertEquals(20, tapeEquilibrium.solution(E));

    }

    @Test
    void 대량의입력값_테스트() {
        // 위 코드가 O(n^2) 으로 짜여졌다면 이번 코드는 O(n) 으로 짜봤다.
        int[] A = new int[200000000];

        for (int i = 0; i < 200000000; i++) {
            A[i] = i;
        }
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        long start = System.currentTimeMillis();
        int actual = tapeEquilibrium.solution(A);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 ["+((end - start)/1000.0)+"]");
        System.out.println(actual);
    }

    @Test
    void 대량의입력값_테스트_시도01() {
        // 가장 큰 입력값을 만들기위해서 Index 크기를
        // Integer.MAX_VALUE 로 했더니 java.lang.OutOfMemoryError: Requested array size exceeds VM limit 에러가 떴다.
        // 생각해보니까 int 는 4byte 그러니 Integer.MAX_VALUE 는 2^31 - 1 이다 계산기 뚜드려 봤더니 8GB 를 잡으려고했던 것이다.
        // 내가 지금 Intellij 에 잡은 VM 힙 사이즈가 2GB 밖에 안되는데 8GB 를 잡으려했으니 이 메세지가 뜨겠지
        // 그래서 800MB 정도면 안전빵으로 내 PC 에서 적당히 큰 입력값을 만들어낼 것 같아서 계산해보니까 200000000 요걸로.
        // 200000000 이것도 5분 기다렸는데 안끝나서 0 하나를 뺀다. 그러면 80MB 정도되겠지
        // 80MB 도 20분이나 기다렸는데도 구하지못했다.. 결과를 보는 것은 포기
        int[] A = new int[BIG_SIZE];

        for (int i = 0; i < BIG_SIZE; i++) {
            A[i] = i;
        }
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        long start = System.currentTimeMillis();
        int actual = tapeEquilibrium.solutionTry01(A);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 ["+((end - start)/1000.0)+"]");
        System.out.println(actual);
    }


}