package hachi.algorithmstudy.playground;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(90);
        stack.push(23);
        stack.push(50);

        System.out.println("before size : " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        System.out.println("after size : " + stack.size());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(90);
        queue.add(23);
        queue.add(50);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
