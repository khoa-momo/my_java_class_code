/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

// ======= DO NOT EDIT MAIN FUNCTION ============

import java.io.*;
import java.util.*;

public class Main {

    //?
    public static void OutputList(List<Course> c) {
        for (Course x : c) {
            System.out.println(x.getName());
        }
    }

    public static void main(String args[]) throws Exception {
        //IO
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //List
        List<Course> a = new ArrayList();
        //data
        a.add(new Course("PRJ311", 110));
        a.add(new Course("DBI202", 150));
        a.add(new Course("PRF192", 120));
        
        //input
        System.out.print("Add more how many course: ");
        int n = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.print("Course name: ");
            String name = in.readLine();
            System.out.print("Course fee: ");
            int fee = Integer.parseInt(in.readLine());
            a.add(new Course(name, fee));
        }
        
        System.out.println("");
        //test
        System.out.print("Enter test function (1-f1;2-f2): ");
        int c = Integer.parseInt(in.readLine());
        
        //check para
        ICourse i = new MyCourse();
        int st = 0;
        double fee = 0;
        
        if (c == 2) {       // 1 nv
            System.out.print("Enter course fee: ");
            fee = Double.parseDouble(in.readLine());
        } else if (c == 1) {        // 2 nv
            System.out.print("Enter st: ");
            st = Integer.parseInt(in.readLine());
        }
        
        //output
        System.out.println("");
        System.out.println("OUTPUT:");
        if (c == 1) {           //TC1
            i.f1(a, st);
            OutputList(a);
            
        //    
        } else if (c == 2) {    //TC2    // count and return numbers of courses in the list “a” which are in the list “a” and has course fee greater than or equals given fee. 
            System.out.println(i.f2(a, fee));
        }
    }
    
}
