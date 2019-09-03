package by.htp.les04.main;

import java.util.Random;
import java.util.Scanner;

/*31.
Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
ошибочные числа пользователя.*/

public class Task31 {

	public static void main(String[] args) {
		Random rn;
        Scanner sc;
        int num;
        int ch;
        
        
        sc = new Scanner(System.in);
        rn = new Random();

        for (int i=0; i<10; i++) {
            num = rn.nextInt((15)+1);

            System.out.println("Попробуй угадать число: ");
            ch = sc.nextInt();

            if (ch == num) {
                System.out.println("Ты угадал! " + num);
            } else {
                System.out.println("Ты не угадал. Зададанное число равно = " + num);
                System.out.println("Твое загаданное число =  "+ ch);
            }
        }

	}

}
