package org.itstep.Praktika;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        Random a = new Random();
        int b = a.nextInt(10);
        int c = a.nextInt(10);
        System.out.println("Таблица умножения. Решите пример:");
        System.out.println(b+ " * " +c+ " = ");
        int f = d.nextInt();
        if ((b*c)==f){
            System.out.println("Верно!");
        } else {
            System.out.println("Неверно!");
        }
    }
}
