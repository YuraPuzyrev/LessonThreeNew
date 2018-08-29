package org.itstep.runner;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int i = 99;
        System.out.println(i);
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        System.out.println(i);*/


        /*int i = 1;
        int j = 3;
        float f = 123;
        char ch = '3';
        boolean b = true;
        System.out.println(f==j);*/

        /*Scanner scanner = new Scanner(System.in);
        int l;
        int m;
        System.out.println("Введите первое число для сравнения");
        l = scanner.nextInt();
        System.out.println("Введите второе число для сравнения");
        m = scanner.nextInt();
        System.out.println(l!=m);*/


        /*int r = 4 , x = 4;
        if(r!=x){
            System.out.println("Выполнилась секция if");}
        else{
            System.out.println("Выполнилась секция else");}*/


        //ЗАДАНИЕ №1
        /*Scanner tr = new Scanner(System.in);
        int y;
        int h;
        System.out.println("Введите первое число для сравнения");
        y = tr.nextInt();
        System.out.println("Введите второе число для сравнения");
        h = tr.nextInt();
        if (y > h) {
            System.out.println("Число " + y + " больше числа " + h);
        } else {
            if (y == h) {
                System.out.println("Число " + y + " равняется числу " + h);
            } else {
                System.out.println("Число " + h + " больше числа " + y);
            }
        }*/


        //ЗАДАНИЕ №3
        /*Scanner trg = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Введите длину первой стороны треугольника");
        a = trg.nextInt();
        System.out.println("Введите длину второй стороны треугольника");
        b = trg.nextInt();
        System.out.println("Введите длину третьей стороны треугольника");
        c = trg.nextInt();
        if (a+b>c && b+c>a && c+a>b) {
            if (a==b && b==c) {
                System.out.println("Треугольник равносторонний");
            } else if (a==b || b==c || c==a) {
                System.out.println("Треугольник равнобедренный");
            } else {
                System.out.println("Треугольник разносторонний");
            }
        }
        else
            System.out.println("Треугольника не существует");*/


        //ЗАДАНИЕ №4
        /*Scanner game = new Scanner(System.in);
        int pl1;
        int pl2;
        int pl3;
        System.out.println("Введите количество очков первого игрока");
        pl1 = game.nextInt();
        System.out.println("Введите количество очков второго игрока");
        pl2 = game.nextInt();
        System.out.println("Введите количество очков третьего игрока");
        pl3 = game.nextInt();
        if (pl1 == pl2 && pl2 == pl3) {
            System.out.println("Нет победителя");
        } else if (pl1 > pl2 && pl2 > pl3) {
            System.out.println("Победил первый игрок, отставание от третьего " + (pl1 - pl3));
        } else if (pl1 > pl3 && pl3 > pl2) {
            System.out.println("Победил первый игрок, отставание от второго " + (pl1 - pl2));
        } else if (pl2 > pl1 && pl1 > pl3) {
            System.out.println("Победил второй игрок, отставание от третьего " + (pl2 - pl3));
        } else if (pl2 > pl3 && pl3 > pl1) {
            System.out.println("Победил второй игрок, отставание от первого " + (pl2 - pl1));
        } else if (pl3 > pl2 && pl2 > pl1) {
            System.out.println("Победил третий игрок, отставание от первого " + (pl3 - pl1));
        } else if (pl3 > pl1 && pl1 > pl2) {
            System.out.println("Победил третий игрок, отставание от второго " + (pl3 - pl2));
        }

    }*/
        //ЗАДАНИЕ №5*
        /*Scanner yr = new Scanner(System.in);
        System.out.println("Введите количество лет");
        int y = yr.nextInt();
        if (y>=5 && y<=20) {
            System.out.println(y + " лет");
        } else if (y>=2 && y<=4) {
            System.out.println(y + " года");
        } else if (y>=100 && y%100>=5 && y%100<=20) {
            System.out.println(y + " лет");
        } else if (y%10>=2 && y%10<=4) {
            System.out.println(y + " года");
        } else if (y%10==1){
            System.out.println(y + " год");
        } else {
            System.out.println(y + " лет");
        }*/

    }
}



