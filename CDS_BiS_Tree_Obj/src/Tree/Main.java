/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        String[] c = {"A","B","C","D","E","F","G","H","I","J"};
        int[] a = {16, 6, 18, 1, 10, 20, 8, 12, 19};
        BSTree b = new BSTree();
        b.insertMany(c,a);
        
        System.out.println("PreOrder traverse: ");
        b.preOrder(b.root);
        System.out.println("");
        
        System.out.println("InOrder traverse: ");
        b.inOrder(b.root);
        System.out.println("");
        
        System.out.println("PostOrder traverse: ");
        b.postOrder(b.root);
        System.out.println("");

        System.out.println("Breadth-1st traverse: ");
        b.breadth(b.root);
        System.out.println("");
        
        System.out.println("Test delete: ");
        b.deleteByCopy(20);
        b.breadth(b.root);
        System.out.println();
    }
}
