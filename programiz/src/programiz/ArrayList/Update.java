/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.ArrayList;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Update {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList();

    // add elements in the array list
    languages.add("Java");
    languages.add("Kotlin");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // change the element of the array list
    languages.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + languages);
  }    
}
