/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Flow;

/**
 *
 * @author DELL
 */
public class Dictionary_sort {
  public static void main(String[] args) {

    String[] words = { "Ruby", "C", "Python", "Java" }; 
    for(int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) { 
        if (words[i].compareTo(words[j]) > 0) { 
          // swap words[i] with words[j[
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    } 
    System.out.println("In lexicographical order:"); 
    for(int i = 0; i < 4; i++) {
      System.out.println(words[i]);
    }
  }
} 