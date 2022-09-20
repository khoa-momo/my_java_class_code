/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.OOPI;

/**
 *
 * @author DELL
 */
 

//What are Access Modifiers?
//In Java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods. For example,

//class Animal {
//    public void method1() {...}
//
//   private void method2() {...}
//}
//method1 is public - This means it can be accessed by other classes.
//method2 is private - This means it can not be accessed by other classes.

//Types of Access Modifier
//Modifier	Description
//Default	declarations are visible only within the package (package private)
//Private	declarations are visible within the class only
//Protected	declarations are visible within the package or all subclasses
//Public	declarations are visible everywhere


//Default Access Modifier
//If we do not explicitly specify any access modifier for classes, methods, variables, etc, then by default the default access modifier is considered. For example,

//package defaultPackage;
//class Logger {
//    void message(){
//        System.out.println("This is a message");
//    }
//}


//Private Access Modifier
//When variables and methods are declared private, they cannot be accessed outside of the class. For example,
//
//class Data {
//    // private variable
//    private String name;
//}
//
//public class Main {
//    public static void main(String[] main){
//
//        // create an object of Data
//        Data d = new Data();
//
//        // access private variable and field from another class
//        d.name = "Programiz";
//    }
//}


//You might be wondering what if we need to access those private variables. 
//In this case, we can use the getters and setters method. For example,
class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Access_mod {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}


//Protected Access Modifier
//When methods and data members are declared protected,
//we can access them within the same package as well as from subclasses. For example,
//
//class Animalx {
//    // protected method
//    protected void display() {
//        System.out.println("I am an animal");
//    }
//}
//
//class Cat extends Animalx {
//    public static void main(String[] args) {
//
//        // create an object of Dog class
//        Cat cat = new cat();
//         // access protected method
//        cat.display();
//    }
//}