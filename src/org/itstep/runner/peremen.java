package org.itstep.runner;

public class peremen {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        int d = 13;
        double e = (double) (a+b+c+d)/4;
        System.out.println("Среднее арифметическое чисел " +a+ " , " +b+ " , " +c+ " и " +d+ " = " +e);

        double p = 3.1415926535;
        int r = 5;
        System.out.println("Площадь круга с радиусом " +r+ " равна " +p*(r*r));

        int h = 1865;
        int hrs = h%24;
        System.out.println("Было дано " +h+ " часов. Это равно " +(h-hrs)/24+ " дней и " +hrs+ " часов.");

        double x = 99;
        double y = 33;
        double z = 11;
        System.out.println("Сумма бесконечно убывающей прогрессии равна " +x/(1-y/x));
    }
}