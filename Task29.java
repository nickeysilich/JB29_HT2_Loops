package by.htp.les04.main;
//29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

import static java.lang.Math.*;

public class Task29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а ");
        String a = scanner.nextLine();
        System.out.println("Введите b ");
        String b = scanner.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n одинаковые числа в числах a and b ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
                }
            }
        }
    }
}

