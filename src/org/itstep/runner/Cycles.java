package org.itstep.runner;
import java.util.Scanner;
import java.lang.String;
public class Cycles {
    public static void main(String[] args) {
        //ЗАДАНИЕ №1
        /*for (int i = 1; i<100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }*/

        //ЗАДАНИЕ №2
        /*Scanner p = new Scanner(System.in);
        System.out.println("Введите значение факториала");
        int f = p.nextInt();
        int j = 1;
        for(int k = 1; k<=f; k++){
            j=j*k;
        }
        System.out.println(j);*/

        //ЗАДАНИЕ №3
        /*int i = 1;
        while(i<100){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
            i++;
        }*/

        /*Scanner p = new Scanner(System.in);
        System.out.println("Введите значение факториала");
        int f = p.nextInt();
        int j = 1;
        int k = 1;
        while(k<=f){
            j=j*k;
            k++;
        }
        System.out.println(j);*/

        //ЗАДАНИЕ №4
        /*Scanner p = new Scanner(System.in);
        System.out.println("Введите значение пременной");
        int x = p.nextInt();
        System.out.println("Введите значение степени");
        int n = p.nextInt();
        int y = 1;
        for(int k = 1; k<=n; k++){
            y=y*x;
        }
        System.out.println(y);*/

        //ЗАДАНИЕ №5
        /*Scanner p = new Scanner(System.in);
        System.out.println("Введите значение факториала");
        int f = p.nextInt();
        int j = 1;
        int k = 1;
        do {
            j=j*k;
            k++;
        } while(k<=f);
        System.out.println(j);*/

        //ЗАДАНИЕ №6*
        /*Scanner a = new Scanner(System.in);
        int x;
        int y;
        int z;
        do {
            System.out.println("Введите первое целое число");
            while (!a.hasNextInt()){
                System.out.println("Введите целое число!");
                a.nextLine();
            }
            x = a.nextInt();
        } while (x <= 0);
        System.out.println("Вы ввели число: " +x);
        do {
            System.out.println("Введите второе целое число");
            while (!a.hasNextInt()){
                System.out.println("Введите целое число!");
                a.nextLine();
            }
            y = a.nextInt();
        } while (y <= 0);
        System.out.println("Вы ввели число: " +y);
        do {
            System.out.println("Введите третье целое число");
            while (!a.hasNextInt()){
                System.out.println("Введите целое число!");
                a.nextLine();
            }
            z = a.nextInt();
        } while (z <= 0);
        System.out.println("Вы ввели число: " +z);
        System.out.println("Вы ввели числа: " +x+ " " +y+ " " +z);*/
    }
}
