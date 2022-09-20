package LinkedList;


public class NodeList<T>{
    
    public T data;
    public NodeList next;

    public NodeList() {
    }

    public NodeList(T data, NodeList next) {
        this.data = data;
        this.next = next;
    }

    public NodeList(T data) {
        this.data = data;
        this.next = null;
    }
    
    
    
}
