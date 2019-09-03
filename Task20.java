package by.htp.les04.main;
//20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен

//заданному е. Общий член ряда имеет вид:

import java.util.Scanner;

public class Task20 {
	public static void main(String[] args) {

		double n;
		double sum;
		double sum2;
		Scanner sc;
		double e;

		sc = new Scanner(System.in);
		System.out.println("Введите n");
		n = sc.nextDouble();
		sum = 0;
		sum2 = 0;
		e = 0;

		for (int i = 1; i <= n; i++) {
			sum = 1 / (((3 * i) - 2) * ((3 * n) + 1));
			if (Math.abs(sum) >= e) {

				sum2 = sum2 + sum;

			}
		}
		System.out.println(sum2);
	}
}
