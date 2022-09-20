/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT_pattern;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class tam_giac {
    
public static void main(String[] args) {
    int n = 8;
    System.out.print("Vi du a:\n\n");
    tamgiaca(n);
    System.out.print("Vi du b:\n\n");
    tamgiacb(n);
    System.out.print("Vi du c:\n\n");
    tamgiacc(n);
    System.out.print("Vi du d:\n\n");
    tamgiacd(n);
    System.out.print("Vi du e:\n\n");
    vd_e(n);
    System.out.print("Vi du f:\n\n");
    vd_f(n);
    System.out.print("Vi du g:\n\n");
    vd_g(n);
    System.out.print("Vi du h:\n\n");
    vd_h(n);
    System.out.print("Vi du i:\n\n");
    vd_i(n);
    System.out.print("Vi du j:\n\n");
    tamgiac_can1(n);
    System.out.print("Vi du k:\n\n");
    tamgiac_can2(n);
    System.out.print("Vi du l:\n\n");
    hinh_thoi(n);
    System.out.print("Vi du m:\n\n");
    tamgiacso_1(n);
    System.out.print("Vi du n:\n\n");
    tamgiacso_2(n);
    System.out.print("Vi du o:\n\n");
    tamgiacso_3(n);
    System.out.print("Vi du p:\n\n");
    tamgiacso_4(n);
    System.out.print("Vi du q:\n\n");
    tamgiaccanso_1(n);
    System.out.print("Vi du r:\n\n");
    tamgiaccanso_2(n);
    System.out.print("Vi du s:\n\n");
    tamgiacnui_1(n);
    System.out.print("Vi du t:\n\n");
    tamgiacnui_2(n);
            
  }
      
static void input(){
    int n;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("n= ");
        n = sc.nextInt();
    }while(n <= 0);
    
}

static void tamgiaca(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(j-i<=0){
                            System.out.print("# ");
                    }else{
                            System.out.print("  ");
                    }
            }
            System.out.print("\n");
    }
}
static void tamgiacb(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(i+j<=n+1){					 
                            System.out.print("# ");
                    }else{
                            System.out.print("  ");
                    }
            }
            System.out.print("\n");
    } 		
}
static void tamgiacc(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(j-i<=-1){
                            System.out.print("  ");
                    }else{
                            System.out.print("# ");
                    }
            }
            System.out.print("\n");
    } 		
}
static void tamgiacd(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(i+j<=n){
                            System.out.print("  ");
                    }else{
                            System.out.print("# ");
                    }
            }
            System.out.print("\n");
    }			
}
static void vd_e(int n){
   for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n)  
                    System.out.print("# ");
            else 
                    System.out.print("  ");			
            }
            System.out.print("\n");		
    }      	 	
}
static void vd_f(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                    if(i==1||i==n||j==i)  
                        System.out.print("# ");
                    else 
                        System.out.print("  ");
                    System.out.print("\n");
    }            	
}
static void vd_g(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                    if(i==1||i==n||j==n-i+1)   
                        System.out.print("# ");
                    else 
                        System.out.print("  ");
                    System.out.print("\n");
    }      	
}

static void vd_h(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==i||j==n-i+1)  
                            System.out.print("# ");
                    else 
                            System.out.print("  ");
                    }
                    System.out.print("\n");
    }    	
}
static void vd_i(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i==1||i==n||j==i||j==n-i+1||j==1||j==n)  
                    System.out.print("# ");
            else 
                    System.out.print("  ");			
            }
            System.out.print("\n");		
    }      	
}

static void tamgiac_can1(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){ 
                if(j<=n-i||j>=n+i){
                    System.out.print("  ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.print("\n");
    }	
}
static void tamgiac_can2(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){ 
                if(j>=i&&j<=2*n-i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
    }	
}
static void hinh_thoi(int n){
    for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){ 
                if(j<=n-i||j>=n+i){
                    System.out.print("  ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.print("\n");
    }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){ 
                if(j>=i&&j<=2*n-i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
    }	
}
 
static void tamgiacso_1(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){
                System.out.printf("%d ",j);
            }
        }
        System.out.print("\n");
    }
}
static void tamgiacso_2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j>=i){
                System.out.printf("%d ",j+1-i);
            }else{
                System.out.print("  ");
            }
        }
            System.out.print("\n");
    }
}
static void tamgiacso_3(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j>=n+1-i){
                System.out.printf("%d ",n+1-j);
            }else{
                System.out.print("  ");
            }
        }
            System.out.print("\n");
    }	
}
static void tamgiacso_4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=n+1-i){
                    System.out.printf("%d ",n+1-j);
            }else{
                    System.out.print("  ");
            }
        }
            System.out.print("\n");
    }	
}
static void tamgiaccanso_1(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n-1;j++){
            if(j<=n){
                if(j+i-n>=1){
                    System.out.printf("%d ",i+j-n);
                }else{
                    System.out.print("  ");
                }
            }else{
                if(n+i-j>=1){
                    System.out.printf("%d ",n+i-j);
                }else{
                    System.out.print("  ");
                }
            }
        }
        System.out.print("\n");
    }
}
static void tamgiaccanso_2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n-1;j++){
            if(j<=n){
                if(j-i+1>=1){
                    System.out.printf("%d ",j-i+1);
                }else{
                    System.out.print("  ");
                }
            }else{
                if(2*n-j-i+1>=1){
                    System.out.printf("%d ",2*n-j-i+1);
                }else{
                    System.out.print("  ");
                }
            }
        }
        System.out.print("\n");
    }
}
static void tamgiacnui_1(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n-1;j++){
            if(j<=n){
                if(j<=i){
                    System.out.printf("%d ",j);
                }else{
                    System.out.print("  ");
                }
            }else{
                if(2*n-j<=i){
                    System.out.printf("%d ",2*n-j);
                }else{
                    System.out.print("  ");
                }
            }
        }
        System.out.print("\n");
    }
}
static void tamgiacnui_2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n-1;j++){
            if(j<=n){
                if(j<=n+1-i){
                        System.out.printf("%d ",j);
                }else{
                        System.out.print("  ");
                }
            }else{
                if(j>=n+i-1){
                        System.out.printf("%d ",2*n-j);
                }else{
                        System.out.print("  ");
                }
            }
        }
        System.out.print("\n");
    }
}














}
