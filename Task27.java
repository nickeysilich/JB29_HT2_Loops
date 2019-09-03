package by.htp.les04.main;
//27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		int a;
		int b;

		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();

		for (int i = a; i < b; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 && j != 1 && j != i) {
					System.out.println("Делитель для " + i + " : " + j);
				}
			}

		}

	}
}
