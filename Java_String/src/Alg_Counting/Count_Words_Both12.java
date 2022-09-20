/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alg_Counting;

/**
 *
 * @author DELL
 */
public class Count_Words_Both12 {
        public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
     
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        String str = "hoc java  -- 6767 .. ,,   co ban den nang cao"
                + "      \n test";
        System.out.print("Số từ của chuỗi đã cho là: "
                + countWords(str));
    }
 
    /**
     * Đếm số từ của một chuỗi, 
     * giả sử các từ được ngăn cách nhau bởi một hoặc nhiều 
     * dấu 'space', tab '\t' và xuống dòng '\n'
     * 
     * @param input - chuỗi ký tự
     * @return số từ của chuỗi ký tự input
     */
    public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB 
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
}
