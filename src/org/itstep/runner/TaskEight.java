package org.itstep.runner;
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = pr.nextDouble();
        System.out.println("Введите второе число");
        double b = pr.nextDouble();
        if (a >= 0 & b >= 0) {
            System.out.println("Среднее арифметическое этих чисел равно " + (a + b) / 2 + "\nCреднее геометрическое этих чисел равно " + (Math.sqrt(a * b)));
        } else {
            System.out.println("Введите положительное число");
        }
    }
}
