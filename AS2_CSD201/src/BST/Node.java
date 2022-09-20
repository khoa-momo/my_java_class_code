package BST;

import Model.Book;

public class Node {
    public Book data;
    public Node left, right;

    public Node() {
    }

    public Node(Book data) {
        this.data = data;
        this.left = this.right = null;
    }
}
