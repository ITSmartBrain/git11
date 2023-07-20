package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                1. Сложить
                2. Вычесть
                3. Умножить
                """);
        int choice = scn.nextInt();
        if(choice == 1) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a + b);
        }
        else if(choice == 2){

        }
        else if(choice == 3){

        }
        else{
            System.out.println("Неверный выбор");
        }

    }
}