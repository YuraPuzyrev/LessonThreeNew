package org.itstep.Praktika;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        int b = a.nextInt();
        System.out.println("Объем куба равен: " +(b*b*b)+ "\nА площадь его поверхности равна: " +6*(b*b));
    }
}
