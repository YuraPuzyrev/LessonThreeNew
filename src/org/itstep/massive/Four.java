package org.itstep.massive;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Four {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        for(int i = 0; i<a.length; i++) {
            a[i] = r.nextInt(10);}
        for(int i = 0; i<a.length; i++) {
            Arrays.sort(a);
            System.out.print(a[i]+ " ");}
    }
}
