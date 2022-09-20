/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class workshop2 {
public static void main(String []args) {
    System.out.println("\nCau a:");
    cau_a1(); 
    System.out.println("\nCau b:");
    cau_b();
}

static void cau_a1(){
    for(int i=2; i<=10; i++){
        if(i%2==1){
        continue;
        }
         System.out.printf("%d ",i);    
    }
} 
static void cau_b(){
    int i,j;
    int n;
    Scanner sc = new Scanner(System.in);
//input		
    do{
    System.out.print("n= "); 
    n = sc.nextInt(); 
    }while(n<0 || n>100);
    int[] a = new int[n];	 
    for(i=0;i<n;i++){
        System.out.printf("a[%d]= ",i); 
        a[i] = sc.nextInt();     //scanf("%d",&a[i]);
    }
//output
    System.out.printf("\nAll elements of the array are: ");
    for(i=0;i<n;i++){
        System.out.printf("%d ",a[i]);
    } 
//Sort
    for (i=0; i<n-1; i++){
        for (j=i+1; j<n; j++){
            if (a[j] > a[i]){
                int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
            }
        }
}
System.out.printf("\nThe array after sorted to descending line: ");
    for (i=0; i<n; i++){
        System.out.printf("%d ", a[i]);
    }	
//Tim max
    int maxValue = a[0];                            
        for (i=0; i<n; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        System.out.printf("\nMax value: %d\n", maxValue); 
}



 

}