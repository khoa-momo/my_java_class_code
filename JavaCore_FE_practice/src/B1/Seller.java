/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

public class Seller extends Employee {

    double revenue;

    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super.name = name;
        super.salary = salary;
        this.revenue = revenue;
    }

    /*Complete the below function for second test case*/
    public double getSalary() {
        if (revenue < 30000) {
            return salary + revenue * 0.05;
        } else {
            return salary + revenue * 0.1;
        }
    }

    @Override
    public String toString() {
        return super.name + "\t" + super.salary + "\t" + revenue;
    }

}
