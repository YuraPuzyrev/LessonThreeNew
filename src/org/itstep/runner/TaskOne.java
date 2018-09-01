package org.itstep.runner;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String a = yr.nextLine();
        System.out.println("Введите ваш возраст");
        int b = yr.nextInt();
        System.out.println("Ваше имя " +a+ " Вам " +b+ " лет.");
    }

}
