package org.itstep.massive;
        import java.util.Arrays;
        import java.util.Scanner;
        import java.util.Random;
public class Two {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        for (int i = 0; i < 10; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Введите целое число!");
                sc.next();
            }
            while (sc.hasNextInt()) {
                a[i] = sc.nextInt();
                System.out.println("Введите число ");
                break;
            }
        }  System.out.println("Массив = " + Arrays.toString(a));
    }
}