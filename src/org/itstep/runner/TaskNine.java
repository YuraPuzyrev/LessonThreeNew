package org.itstep.runner;
import java.util.Scanner;
public class TaskNine {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.println("Введите длину первого катета");
        double a = tr.nextDouble();
        System.out.println("Введите длину второго катета");
        double b = tr.nextDouble();
        System.out.println("Длина гипотенузы равна " +Math.floor(Math.sqrt(a*a+b*b))+ " площадь равна " +(a*b)/2);
    }
}