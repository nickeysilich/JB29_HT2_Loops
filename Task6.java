package by.htp.les04.main;

import java.util.Scanner;

/*6. Напишите программу, где пользователь вводитлюбое целое положительное число.
А программа
суммирует все числа от 1 до введенного пользователем числа.*/

public class Task6 {

	public static void main(String[] args) {
		int x;
		int sum;
		int a;
		Scanner sc;
		
		x = 1;
		sum = 0;
		sc = new Scanner(System.in);
		
		System.out.println("Введите любой целое положительное число");
		a = sc.nextInt();
		
		while (x < a) {
			sum += x;
			x++;
		}
		System.out.println("Сумма всех чисел = " + sum);

	}

}
