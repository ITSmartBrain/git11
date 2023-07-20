package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                1. Сложить
                2. Вчесть
                """);
        int choice = scn.nextInt();
        if(choice == 1){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a + b);
        }
        else if(choice == 2){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a * b);
        }





    }
}