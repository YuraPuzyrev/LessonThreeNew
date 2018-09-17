package org.itstep.massive;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class one {
    public static void main(String[] args) {
        /*int[] a = new int[10];
        Random r = new Random();
        for(int i = 0; i<a.length; i++) {
            a[i] = r.nextInt(10);
        System.out.print(a[i]+ " ");}*/

        int[][] a;
        a = new int[10][5];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = r.nextInt(20);
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
