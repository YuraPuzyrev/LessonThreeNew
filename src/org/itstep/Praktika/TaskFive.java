package org.itstep.Praktika;

import java.util.Arrays;
import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        int[][][] a = new int[5][5][5];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++)
                a[i][j][k] = r.nextInt(20);
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++)
                System.out.print(a[i][j][k] + " ");
            }
            System.out.println();
        }
    }
}
