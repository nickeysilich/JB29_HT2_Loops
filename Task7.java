package by.htp.les04.main;

import java.util.Scanner;

//7. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task7 {

	public static void main(String[] args) {
		Scanner sc;
		double a;
		double b;
		double h;
		double y;

		sc = new Scanner(System.in);
		System.out.println("Введите A");
		a = sc.nextDouble();
		System.out.println("Введите B");
		b = sc.nextDouble();
		System.out.println("Введите шаг h");
		h = sc.nextDouble();

		for (double x = a; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);
			} else {
				y = -x;
				System.out.println("y = " + y);
			}
		}
	}
}
