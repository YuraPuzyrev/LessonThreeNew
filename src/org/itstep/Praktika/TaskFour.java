package org.itstep.Praktika;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int b = a.nextInt();
        int sum = 0;
        while (b>0){
            sum = sum+(b%10);
            b=b/10;
        }
        System.out.println(sum);
    }
}
