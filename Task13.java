package by.htp.les04.main;
//13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc;
		double a;
		double b;
		double h;
		double y;

		a = -5;
		b = 5;
		h = 0.5;
		y = 0;

		for (double x = a; x <= b; x = x + h) {
			y = 5 - (x * x) / 2;
			System.out.println("y = " + y);
		}
	}

}
