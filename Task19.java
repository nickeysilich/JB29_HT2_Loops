package by.htp.les04.main;
//19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен

//заданному е. Общий член ряда имеет вид:

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		double e;
		double n;
		double sum;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите n");
		n = sc.nextDouble();
		e = 0;
		sum = 0;
		for (int i = 0; i <= 10; i++) {
			n++;
			double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			if (e <= Math.abs(a))
				;
			sum = sum + a;

		}
		System.out.println(sum);
	}
}
