/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");
        emails.add(".username@yahoo.com");
        emails.add("username@yahoo.com.");
        emails.add("username@yahoo..com");
        emails.add("username@yahoo.c");
        emails.add("username@yahoo.corporate");


        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for(Object email : emails){
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
    
}
