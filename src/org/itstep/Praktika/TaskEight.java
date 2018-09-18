package org.itstep.Praktika;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" +");
        int result = 0;
        for(String tempWord: words){
            if(tempWord.length()>result){
                result = tempWord.length();
            }
        }
        System.out.println("Саммое длинное слово: " +result+ " символов");
    }
}
