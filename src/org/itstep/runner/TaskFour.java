package org.itstep.runner;
import java.util.Scanner;
import java.util.Random;
public class TaskFour {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(20);
        System.out.println("Угадайте число! У вас есть ровно пять попыток!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 20:");
        int b = sc.nextInt();
        do {
            if (b<a) {
                System.out.println("Мало! Попробуйте ещё разок:");
            } else if (b>a) {
                System.out.println("Много! Попробуйте ещё разок:");}
            while (a == b) {
                System.out.println("Победа!");
                a++;
            }
        } while (a<5);
    }
}