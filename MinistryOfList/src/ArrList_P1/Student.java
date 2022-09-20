/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_P1;

/**
 *
 * @author DELL
 */
public class Student {
    public String name;
    public int age;
    public float mark;

    public Student() {
    }
    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    } 
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    } 
    public void setAge(int age) {
        this.age = age;
    }

    public float getMark() {
        return mark;
    }
    public void setMark(float mark) {
        this.mark = mark;
    }
    
     @Override
    public String toString() {
        return name + "\t" + age + "\t" + mark;
    }
 
}
