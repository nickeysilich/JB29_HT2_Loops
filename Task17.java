package by.htp.les04.main;

import java.util.Scanner;

//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {

		double a;
		double n;
		double proiz;
		Scanner sc;

		sc = new Scanner(System.in);
		proiz = 1;

		System.out.println("Введите а");
		a = sc.nextDouble();
		System.out.println("Введите n");
		n = sc.nextDouble();

		for (double i = 0; i < n; i++) {
			proiz *= a + i;
		}
		System.out.println(proiz);

	}

}
