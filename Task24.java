package by.htp.les04.main;
//24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в

//другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		String a;
		int x;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextLine();
		x = 0;

		for (int i = 0; i < a.length(); i++) {
			a.charAt(i);
			for (int j = 0; j < a.length(); j++) {
				if (j % 2 == 0) {
					x += j;

					System.out.println(x);
				}
			}
		}
	}
}
