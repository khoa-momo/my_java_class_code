/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

public class Course implements Comparable<Course> {
    String name;
    double fee;
    
    public Course() {
    }
    public Course(String name, double fee) {
        this.fee = fee;
        this.name = name;
    }

    public String getName() {
        return name;
    }
     
    //THE OG SORT ---> FEE
    @Override
    public int compareTo(Course o) {
        return Double.toString(this.fee).compareTo(Double.toString(o.fee));
    }
}
