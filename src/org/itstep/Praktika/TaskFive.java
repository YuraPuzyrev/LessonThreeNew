package org.itstep.Praktika;

import java.util.Arrays;
import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        int[][][] a = new int[3][3][3];
        Random r = new Random();
        //заполнение
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++)
                    a[i][j][k] = r.nextInt(20);
            }
        }
        //поиск элементов
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                    if (a[i][j][k] > max) {
                        max = a[i][j][k];
                    }
                    if(a[i][j][k]<min){
                        min = a[i][j][k];
                    }
                }
            }
        }
        System.out.println("\n" +max);
        System.out.println(min);
    }
}