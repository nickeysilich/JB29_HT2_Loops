package by.htp.les04.main;
// 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		int a;
		int b;
		char x;
		char y;
		int i;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		i = (int) a;
		y = (char) b;

		while (i >= a & i < b) {
			a = (char) i;
			x = (char) a;
			System.out.println(x + " " + (int) a);
			i++;
		}
		System.out.println(y + " " + (int) b);

	}

}
