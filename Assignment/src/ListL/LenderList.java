package ListL;

import lms.Lending;

public class LenderList {

    NodeL head, tail, sorted;

    public LenderList() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Lending x) {
        if (isEmpty()) {
            head = tail = new NodeL(x);
        } else {
            NodeL q = new NodeL(x);
            q.next = head;
            head = q;
        }
    }

    public void addLast(Lending x) {
        NodeL q = new NodeL(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    public void traverse() {
        NodeL p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
        System.out.println();
    }
}
