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
        int[] a = {16, 6, 18, 1, 10, 20, 8, 12, 19};
        BSTree b = new BSTree();
        b.insertMany(a);
        System.out.println("1. Breadth-1st traverse: ");
        b.breadth(b.root);
        System.out.println(""); //16  6  18  1  10  20  8  12  19 
        
        System.out.println("2. PreOrder traverse: ");
        b.preOrder(b.root);
        System.out.println(""); //16  6  1  10  8  12  18  20  19  
        
        System.out.println("3. InOrder traverse: ");
        b.inOrder(b.root);
        System.out.println(""); //1  6  8  10  12  16  18  19  20  
        
        System.out.println("4. PostOrder traverse: ");
        b.postOrder(b.root);
        System.out.println(""); //1  8  12  10  6  19  20  18  16
    }
}
