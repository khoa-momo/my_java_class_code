package BST;

import java.util.*;

public class MyQueue {

    public LinkedList<Node> t;

    public MyQueue() {
        t = new LinkedList<>();
    }

    public void clear() {
        t.clear();
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    public void enqueue(Node p) {
        t.addLast(p);
    }

    public Node dequeue() {
        if (isEmpty()) {
            return null;
        }
        return t.removeFirst();
    }

    public Node front() {
        if (isEmpty()) {
            return null;
        }
        return t.getFirst();
    }
}
