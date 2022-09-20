package qlsv;

import java.util.Scanner;

/**
 * Main class
 * 
 * @author viettuts.vn
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String choose = null;
        int a = 0;
        boolean flag = true;
//        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        //SM sm/LIST = new SM
        int studentId;
 
//Scanner sc = new Scanner(System.in);
//    CD alb[] = new CD[100]; 
//    int a, n = 0;
//    boolean flag = true;
//    do {
//        System.out.print("1.Nhập thông tin CD \n2.Xuất danh sách Album.\n3.Tính tổng giá thành \n4.Tổng số lượng CD \n" +
//                "5.Sắp xếp giảm dần theo giá thành\n6.Sắp xếp tăng dần theo tựa CD\n7.Nhập số khác để thoát\nChon so: ");
//        a = sc.nextInt();
//        switch (a){        
        
        do{
            showMenu();
            a = scanner.nextInt();
            switch(a){
            case 1: //add
                studentManager.add();
                break;
            case 2: //update
                studentId = studentManager.inputId();
                studentManager.edit(studentId);
                break;
            case 3: //delete
                studentId = studentManager.inputId();
                studentManager.delete(studentId);
                break;
            case 4: //sort
                studentManager.sortStudentByGPA();
                break;
            case 5: //sort
                studentManager.sortStudentByName();
                break;
            case 6: //List all
                studentManager.show();
                break;
//            case 7:
//                System.out.println("exited!");
//                exit = true;
//                break;
//            default:
//                System.out.println("invalid! please choose action in below menu:");
//                break;
            default:
                System.out.println("Cam on quy khach dan su dung dich vu");
                System.out.println();
                flag = false;
                break;    
            }
//            if(exit){
//                break;
//            }
//            show menu
//            showMenu();
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
