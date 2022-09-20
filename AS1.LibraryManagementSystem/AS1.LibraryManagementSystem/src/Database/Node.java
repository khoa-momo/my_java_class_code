package Database;

/**
 *
 * @author quynm
 */
public class Node<T>{
    
    T data;
    Node next;

    public Node() {
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
    
    
}
