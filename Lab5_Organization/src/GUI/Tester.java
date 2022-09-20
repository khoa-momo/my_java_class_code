/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.University;
import DTO.Role;

/**
 *
 * @author DELL
 */
public class Tester {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Colony obj1 = new BeeColony(2000,"land","honey");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        University obj2 = new FPTUniversity(100000,"FPT","CanTho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Role df = new BeeColony(3000,"land","wasp");
        System.out.println(df);
        df.createWorker();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        df = new FPTUniversity(100000,"FPT","HANOI");
        System.out.println(df);
        df.createWorker();
        
    }    
}
