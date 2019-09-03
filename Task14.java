package by.htp.les04.main;
//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		double n;
		Scanner sc;
		double x = 1;
		double i;
		double i1;

		sc = new Scanner(System.in);
		System.out.println("Введите число");
		n = sc.nextDouble();
		i1 = 0;

		while (x <= n) {
			i = 1 / x;
			i1 += i;
			x++;
		}
		System.out.println("Результат вычисление = " + i1);
	}

}
