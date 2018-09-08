package org.itstep.string;
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        String a = new String("Работяга");
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        a = sc.nextLine();
        System.out.println(a);
    }
}
