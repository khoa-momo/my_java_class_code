/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_Linked_List;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        //don gian
//        Person p = new Person("Ha", 5);
//        Node x = new Node(p);
//        System.out.println("Info x:"+x.infor);
//        System.out.println("----------------------");
//        
//        //Node
//        Node a,b,c;
//        a = new Node(p);
//        b = new Node(new Person("Binh", 19), a);
//        c = new Node(new Person("Tuan", 19), b);
//        System.out.println("Info c:"+c.infor);
//        System.out.println("Info b:"+c.next.infor);
//        System.out.println("Info a:"+c.next.next.infor);
        
        //list 
        String[] name = {"Ha", "Binh", "Tuan", "Ngoc"};
        int[] age = {19,10,20,21};
        MyList t = new MyList();
        t.addLastMany(name, age);
        t.addLast(new Person("Hanh", 19));
        t.traverse();
        
        
    }
}
