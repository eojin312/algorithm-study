package hachi.algorithmstudy.playground;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEgde(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
        }
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new PriorityQueue<>();
        queue.add(root);
        root.marked = true;
        while (!queue.isEmpty()) {
            Node r = queue.poll();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.poll();
                }
            }
        }
    }
}
