package by.htp.les04.main;
//8. Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc;
		int a;
		int b;
		double h;
		double y;
		int c;

		sc = new Scanner(System.in);
		System.out.println("Введите A");
		a = sc.nextInt();
		System.out.println("Введите B");
		b = sc.nextInt();
		System.out.println("Введите шаг h");
		h = sc.nextDouble();
		c = 3;

		for (double x = a; x <= b; x = x + h) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y = " + y);
			} else
				y = (x - c) + 6;
			System.out.println("y = " + y);
		}
	}

}
