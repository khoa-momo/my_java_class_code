/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;
//import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author DELL
 */
public class HashMap {
    public static void main(String args[]) {
        // khoi tao hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // them cac phan tu vao hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");
        // hien thi HashMap
        System.out.println(hashMap);
    }    
}
