package hachi.algorithmstudy.lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
