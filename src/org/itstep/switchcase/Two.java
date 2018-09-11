package org.itstep.switchcase;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        int a = sc.nextInt();
        switch (a){
            case 30: {
                System.out.print("Апреле, июне, сентябре, ноябре,");
            }
            case 31:{
                System.out.println(" январе, марте, мае, июле, августе, октябре и декабре.");break;
            }
            default:{
                System.out.println("Есть во всех месяцах.");
            }
        }
    }
}
