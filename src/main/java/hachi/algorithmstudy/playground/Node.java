package hachi.algorithmstudy.playground;

import java.util.LinkedList;

public class Node {
    int data;
    LinkedList<Node> adjacent; // 그래프에선 인접한 그래프가 뭐냐 라고 리스트에 쭉 나열(인접한 노드)
    boolean marked;

    public Node(int data) {
        this.data = data;
        this.marked = false;
        this.adjacent = new LinkedList<>();
    }
}
