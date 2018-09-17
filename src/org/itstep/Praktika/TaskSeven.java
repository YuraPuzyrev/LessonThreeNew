package org.itstep.Praktika;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Наберите текст:");
        String b = a.nextLine();
        System.out.println("Введите контрольное слово:");
        String c = a.nextLine();
        if (b.contains(c)) {
            System.out.println("В набранном тексте присутствует контрольное слово.");
        } else {
            System.out.println("В набранном тексте отсутствеут контрольное слово.");
        }
    }
}