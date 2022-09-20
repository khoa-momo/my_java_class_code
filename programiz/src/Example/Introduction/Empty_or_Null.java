/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Introduction;

/**
 *
 * @author DELL
 */
public class Empty_or_Null {
     
    public static void main(String[] args) {
    // create null, empty, and regular strings
    String str1 = null;
    String str2 = "";
    String str3 = "  ";

    // check if str1 is null or empty
    System.out.println("str1 is " + isNullEmpty(str1));
    // check if str2 is null or empty
    System.out.println("str2 is " + isNullEmpty(str2));
    // check if str3 is null or empty
    System.out.println("str3 is " + isNullEmpty(str3));
  }
  // method check if string is null or empty
  public static String isNullEmpty(String str) { 
    // check if string is null
    if (str == null) {
      return "NULL";
    } 
    // check if string is empty
    else if(str.isEmpty()){
      return "EMPTY";
    }
    else {
      return "neither NULL nor EMPTY";
    }
  }
}


//public static void main(String[] args) {
//    
//    // create a string with white spaces
//    String str = "    ";
//
//    // check if str1 is null or empty
//    System.out.println("str is " + isNullEmpty(str));
//  }
//
//  // method check if string is null or empty
//  public static String isNullEmpty(String str) {
//
//    // check if string is null
//    if (str == null) {
//      return "NULL";
//    }
//
//    // check if string is empty
//    else if (str.trim().isEmpty()){
//      return "EMPTY";
//    }
//
//    else {
//      return "neither NULL nor EMPTY";
//    }
//  }