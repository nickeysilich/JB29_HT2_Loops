package by.htp.les04.main;
//33. Найдите наибольшую цифру данного натурального числа

import java.util.Scanner;

public class Task33 {
	public static void main(String[] args) {
		int a;
		int x;
		int y;
		int z;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		y = 0;

		for (int i = 0; a > 0; i++) {
			x = a % 10;
			if (x > y) {
				y = x;
			}
			a /= 10;
		}
		System.out.println("Наибольшая цифра числа = " + y);

	}
}
