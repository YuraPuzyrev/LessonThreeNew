package org.itstep.switchcase;


import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*float b = 1.1f;
        int a = 3;
        String str = "Декабрь";
        switch (str){
            case "Декабрь":{
            }
            case "Январь":{
            }
            case "Февраль":{
                System.out.println("Это зимний месяц");break;
            }
            default:{
                System.out.println("Совпадений не найдено");
            }
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String mnth = sc.nextLine();
        switch (mnth) {
            case "январь": {
            }
            case "март": {
            }
            case "май": {
            }
            case "июль": {
            }
            case "август": {
            }
            case "октябрь": {
            }
            case "декабрь": {
                System.out.println("В этом месяце 31 день");break;
            }
            case "февраль": {
                System.out.println("В этом месяце 28 дней");break;
            }
            case "апрель": {
            }
            case "июнь": {
            }
            case "сентябрь": {
            }
            case "ноябрь": {
                System.out.println("В этом месяце 30 дней");break;
            }
            default: {
                System.out.println("Введите название месяца");
            }
        }
    }
}
