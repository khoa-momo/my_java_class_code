/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3;
import java.util.*;

public class MyPrinter implements IPrinter {
    
    //delete func
    @Override
    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).price <= price) {
                a.remove(a.get(i));
            }
        }
    }
    
    //count func
    @Override
    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).name.contains(name)) {
                count++;
            }
        }
        return count;
    }

}
