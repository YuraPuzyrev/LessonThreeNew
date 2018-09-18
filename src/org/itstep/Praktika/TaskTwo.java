package org.itstep.Praktika;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        /*Scanner d = new Scanner(System.in);
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
        }*/

        //Разбор
        Scanner scanner = new Scanner(System.in);
        int result;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("Введите результат произведения чисел " +i+ " и " +j);
                result = scanner.nextInt();
                if(result == i*j){
                    System.out.println("Верно!");
                }else {
                    System.out.println("Неверно!");
                }
            }

        }
    }
}
