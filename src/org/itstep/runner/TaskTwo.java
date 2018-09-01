package org.itstep.runner;
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите число");
        int a = ch.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + 2);
        } else {
            System.out.println(a + 1);
        }
    }
}