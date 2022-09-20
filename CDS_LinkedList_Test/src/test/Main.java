/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DELL
 */
public class Main{
    public static void main(String [] args){
        
    MyList t = new MyList();
    Node p; Ticket x;
    String[] a={"HN","HP","TH","HU","DN","QB","NT"};
    int[] b = {300,180,200,190,430,200,100};


    System.out.println("\n1. Test addLast");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse(); 
        t.addEnd("TB",200);
        t.addEnd("TB",300);
        t.traverse(); 
// (HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100)
// (HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100)

    System.out.println("\n2. Test searchByPath");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse();
        
        //The Func
        p = t.searchByPath("DN");
        if(p==null)
            System.out.println("Not found");
        else{
            System.out.println("The Ticket found is");
            t.visit(p); 
            System.out.println();
        }
//(HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100) 
//The Ticket found is
//(DN, 430)
        
    System.out.println("\n3. Test insertAfter");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse();
        x = new Ticket("LS",300);
        
        //The Func
        t.insertAfter(x,200);  
        t.traverse();
//(HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT,100) 
//(HN, 300)(HP, 180)(TH, 200)(LS, 300)(HU, 190)(DN, 430)(QB, 200) (NT,100)

    System.out.println("\n4. Test removeFirst()");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse();
        
        //The Func
        t.removeFirst();
        t.traverse(); 
//(HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100) 
//(HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100)


    System.out.println("\n5. cheapestPrice()");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse();
        
        //The Func
        p = t.cheapestPrice();
        System.out.println("The ticket with cheapest price");
        t.visit(p);
        System.out.println();
// (HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100) 
//The ticket with cheapest price
//(NT, 100)


    System.out.println("\n6. Test remove(Node q)");
        t.clear();
        t.addLastMany(a,b);  
        t.traverse();
        Node q = t.searchByPath("HU"); 
        //The Func
        t.remove(q);  
        t.traverse();
//(HN, 300) (HP, 180) (TH, 200) (HU, 190) (DN, 430) (QB, 200) (NT, 100) 
//(HN, 300) (HP, 180) (TH, 200) (DN, 430) (QB, 200) (NT, 100)    

        
    }
    
}
