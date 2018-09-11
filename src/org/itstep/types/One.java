package org.itstep.types;

public class One {
    public static void main(String[] args) {
        String str = "111";
        int a = 0;
        a = Integer.parseInt(str);//перевод строки в число
        System.out.println(a);
        a = 678;
        str = String.valueOf(a);//перевод из числа в строку
        str = Integer.toString(a);//перевод из числа в строку
        System.out.println(str);
    }
}
