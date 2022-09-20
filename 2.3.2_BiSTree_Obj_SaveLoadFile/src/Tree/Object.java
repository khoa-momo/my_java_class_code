/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author DELL
 */
public class Object {
    String name;
    int number;
    double salary;

    public Object() {
    }
    public Object(String xName, int xNumber, double xSalary) {
        name = xName;
        number = xNumber;
        salary = xSalary;
    }

    @Override
    public String toString() {
        return  "(" + name + ", " + number + ", " + salary + ") ";
    }
    
    
    
}
