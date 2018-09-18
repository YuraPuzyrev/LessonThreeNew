package org.itstep.Praktika;

import java.util.Random;

public class TaskNine {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] intArr = new int[3][3];
        //заполнение
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = random.nextInt(22);
            }
        }
        //вывод
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }
        //ищем максимальное значение
        int max = Integer.MIN_VALUE;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                if (intArr[i][j] > max) {
                    max = intArr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        //выводим значения
        System.out.println("Максимальное значение = " +max);
        System.out.println("Индекс i = " +indexI);
        System.out.println("Индекс j = " +indexJ);
        if(indexI==0){
            System.out.println("Соседа сверху нет");
        }else{
            System.out.println("Сосед сверху " + intArr[indexI-1][indexJ]);
        }
        if(indexI==intArr.length-1){
            System.out.println("Соседа снизу нет");
        }else{
            System.out.println("Сосед снизу " + intArr[indexI+1][indexJ]);
        }
        if(indexJ==0){
            System.out.println("Соседа слева нет");
        }else{
            System.out.println("Сосед слева " + intArr[indexI][indexJ-1]);
        }
        if(indexJ==intArr.length-1){
            System.out.println("Соседа справа нет");
        }else{
            System.out.println("Сосед справа " + intArr[indexI][indexJ+1]);
        }
    }
}