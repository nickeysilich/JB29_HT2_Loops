package by.htp.les04.main;
//35. Найдите количество четных цифр данного натурального числа.

import java.util.Scanner;

public class Task35 {

    public static void main(String[] args) {
    	int b;
        int c = 0;
        int d = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();

        for (int i = 1; a > 0; i++){
            d = d + 1;
            b = a % 10;
            if (b % 2 == 0){
                c++;
            }
            a = a / 10;
        }
        System.out.println("Количество четных цифр: " + c);

        
    }
}
