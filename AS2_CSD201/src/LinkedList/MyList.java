package LinkedList;



public class MyList<T> {

    public NodeList<T> head, tail;

    public MyList() {
        head = tail = null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }
    
    public int size() {
        int sz = 0;
        NodeList i = head;
        while (i != null) {
            i = i.next;
            sz++;
        }
        return sz;
    }
    
    public void addFirst(T x) {
        head = new NodeList(x, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(T x) {
        NodeList q = new NodeList(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
    
    public void insertAfter(NodeList q, T x) {
        NodeList p = new NodeList(x);
        p.next = q.next;
        q.next = p;
    }
    
    public void remove(NodeList q) {
        NodeList i = head;
        while (i != null) {
            if (i.next == q) {
                i.next = q.next;
                q.next = null;
                break;
            }
            i = i.next;
        }
    }

    public NodeList pos(int k) {
        NodeList i = head;
        while (i != null) {
            i = i.next;
            k--;
            if (k == 0) {
                return i;
            }
        }
        return (null);
    }

    public void removePos(int k) {
        remove(pos(k));
    }
    
    
}
