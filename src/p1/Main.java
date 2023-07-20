package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                1. Сложить
                2. Вычесть
                """);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a+b);
        if(a > b){
            System.out.println("test");
        }
    }
}