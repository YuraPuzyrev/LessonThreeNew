package org.itstep.string;

import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        String a = new String("Сегодня   самый лучший день в году. ");
        //Способ №1
        /*int sum = 0;
        Character g = new Character(' ');
        System.out.println(g.isWhitespace(g));
        for (int c = 0; c<a.length();c++){
            char x = a.charAt(c);
            if(x==g){
                sum++;}
        }
        System.out.println("В строке " +(sum+1)+ " слов");*/

        //Способ №2
        /*int b = a.split(" ").length;
        System.out.println("В строке " +b+ " слов");*/

        //Способ в классе
        /*String[] result = a.split(" ");
        System.out.println(Arrays.toString(result));
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[i].isEmpty()) {
                counter++;
            }
        }
        /*for (String x : result) {
            if (!x.isEmpty()) {
                counter++;
            }*/
        //Способ через регулярное выражение "+"(одно или более повторений)
        String[] result = a.split(" +");
        System.out.println(Arrays.toString(result));
        System.out.println("Количество слов равно " + result.length);
        }
    }
