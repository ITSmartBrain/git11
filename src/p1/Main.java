package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("""
                1. Сложить
                2. Вычесть
                3. Умножить
                4. Делить
                """);
        int choice = scn.nextInt();
        if(choice == 1) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a + b);
        }
        else if(choice == 2){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a-b);
        }
        else if(choice == 3){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a*b);
        }
        else if(choice == 4){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a/b);
        }

        else{
            System.out.println("Неверный выбор");
        }

    }
}