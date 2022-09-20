/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.String;
import java.io.PrintWriter;
import java.io.StringWriter;
/**
 *
 * @author DELL
 */
public class Stack_Trace_to_String {
        public static void main(String[] args) {

        try {
            int division = 0 / 0;
        } catch (ArithmeticException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}
