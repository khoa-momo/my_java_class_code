/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample07;

import java.util.Comparator;

/**
 *
 * @author KienLT
 */
public class CompareEmployeeByAge implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if((o1 instanceof Employee) && (o2 instanceof Employee)) {
            Employee emp1 = (Employee)o1;
            Employee emp2 = (Employee)o2;
            return emp1.getAge() - emp2.getAge();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
