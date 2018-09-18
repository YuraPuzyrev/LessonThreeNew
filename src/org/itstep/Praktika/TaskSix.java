package org.itstep.Praktika;

public class TaskSix {
    public static void main(String[] args) {
        String start = "10:30:45";
        String finish = "13:29:44";
        String[] arrStart = start.split(":");
        String[] arrFinish = finish.split(":");
        int [] arrResult = new int[arrStart.length];
        int startTemp;
        int finishTemp;
        for (int i = 0; i < arrStart.length; i++) {
            startTemp = Integer.parseInt(arrStart[i]);
            finishTemp = Integer.parseInt(arrFinish[i]);
            if((finishTemp-startTemp)>=0){
                arrResult[i] = finishTemp-startTemp;
            }else{
                if(i!=0){
                    arrResult[i] = finishTemp + 59 -startTemp;
                }else {
                    arrResult[i] = finishTemp + 24 - startTemp;
                }
            }
        }
        System.out.println("Результат: " +arrResult[0]+ ":" +arrResult[1]+ ":" +arrResult[2]);
    }
}
