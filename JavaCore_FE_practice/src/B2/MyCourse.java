/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

import java.util.*;

public class MyCourse implements ICourse {
    
//    public static void OutputList(List<Course> c) {
//        for (Course x : c) {
//            System.out.println(x.getName());
//        }
//    } 
    //f2
    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).fee >= fee) {
                count++;
            }
        }
        return count;
    } 
//    sort NAME!!!
    class sortByName implements Comparator<Course> {
        @Override
        public int compare(Course o1, Course o2) {
            return o2.name.compareTo(o1.name); //->NAME!!!
        }
    }  
    //f1
    @Override
    public void f1(List<Course> a, int st) {
        if (st == 1) {
            Collections.sort(a);    //sort fee up
        } else {
            Collections.sort(a, new sortByName()); //sort name down
        }
    }

    public MyCourse() {
    }


}
