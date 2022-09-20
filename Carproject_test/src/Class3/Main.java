package Class3;

import java.util.Scanner;

/**
 * Main class
 * 
 * @author viettuts.vn
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) { 
        int a = 0;
        boolean flag = true; 
        StudentManager studentManager = new StudentManager();
        int studentId;                                                                    
        
        do{
            showMenu();
            a = scanner.nextInt();
            switch(a){
            case 1:
                studentManager.add();
                break;
            case 2:
                studentId = studentManager.inputId();
                studentManager.edit(studentId);
                break;
            case 3:
                studentId = studentManager.inputId();
                studentManager.delete(studentId);
                break;
            case 4:
                studentManager.sortStudentByGPA();
                break;
            case 5:
                studentManager.sortStudentByName();
                break;
            case 6:
                studentManager.show();
                break; 
            default:
                System.out.println("Cam on quy khach dan su dung dich vu");
                System.out.println();
                flag = false;
                break;    
            } 
        }while(flag); 
    }//end main
    
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
        
    }
}//end class
