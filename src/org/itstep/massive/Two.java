package org.itstep.massive;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Two {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число ");
            a[i] =sc.nextInt();
        }
        System.out.println("Массив = " +Arrays.toString(a));

    }
}
