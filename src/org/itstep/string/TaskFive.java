package org.itstep.string;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        /*Character a = new Character('T');
        Character b = Character.toLowerCase(a);
        System.out.println(b);*/

        //В классе:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите один латинский символ");
        String tempValue = scanner.nextLine();
        if(tempValue.length()==1){
            char ch = tempValue.charAt(0);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(Character.isLowerCase(ch)){
                    System.out.println("Результат = " +Character.toUpperCase(ch));
                }else {
                    System.out.println("Результат = " +Character.toLowerCase(ch));
                }
            }else {
                System.out.println("Символ не латинский");
            }
        }else {
            System.out.println("Некорректный ввод");
        }
    }
}
