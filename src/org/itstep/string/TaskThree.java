package org.itstep.string;

public class TaskThree {
    public static void main(String[] args) {
        String a = new String("хрусталь");
        String b = new String("сталь");
        if (a.contains(b)){
            System.out.println("В строке " +a+ " присутствует строка " +b);
        }
    }
}
