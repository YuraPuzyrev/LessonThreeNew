package org.itstep.string;

public class TaskFour {
    public static void main(String[] args) {
        String a = new String("Сегодня самый лучший день в году.");
        //Способ №1
        int sum = 0;
        Character g = new Character(' ');
        System.out.println(g.isWhitespace(g));
        for (int c = 0; c<a.length();c++){
            char x = a.charAt(c);
            if(x==g){
                sum++;}
        }
        System.out.println("В строке " +(sum+1)+ " слов");

        //Способ №2
        /*int b = a.split(" ").length;
        System.out.println("В строке " +b+ " слов");*/
    }
}
