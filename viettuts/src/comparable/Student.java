/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

/**
 *
 * @author DELL
 */
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String address;
 
    public Student() {
    } 
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    // getter & setter
    public int getId() {
        return id;
    } 
    public void setId(int id) {
        this.id = id;
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
    public String getAddress() {
        return address;
    } 
    public void setAddress(String address) {
        this.address = address;
    }  
    
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name + ",age=" + age + ",address=" + address;
    }
 
    @Override
    public int compareTo(Student student) {
        // sort student's name by ASC
        return this.getName().compareTo(student.getName());
    }    
 
}
