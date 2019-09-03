package by.htp.les04.main;
//18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

import java.util.Scanner;

public class Task18 {
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
			double a = Math.pow(-1, (n - 1)) / n;
			if (e <= Math.abs(a))
				;
			sum = sum + a;

		}
		System.out.println(sum);

	}

}
