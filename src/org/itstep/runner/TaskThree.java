package org.itstep.runner;

public class TaskThree {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c;
        System.out.println("Число a равно " +a+ "\nЧисло b равно " +b);
        c = a;
        a = b;
        b = c;
        System.out.println("Число a равно " +a+ "\nЧисло b равно " +b);
    }
}
