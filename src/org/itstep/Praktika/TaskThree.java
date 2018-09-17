package org.itstep.Praktika;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите название валюты: Доллар, Евро или Гривна.");
        String b = a.next();
        switch (b){
            case "Доллар":{
                System.out.println("Курс доллара: 1,92"); break;
            }
            case "Евро":{
                System.out.println("Курс евро: 2,34"); break;
            }
            case "Гривна":{
                System.out.println("Курс гривны: 0,65"); break;
            }
            default: {
                System.out.println("Неверный запрос");
            }
        }
    }
}
