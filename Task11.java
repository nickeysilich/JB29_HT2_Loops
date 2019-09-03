package by.htp.les04.main;
//11. Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		a = 1;
		c = 1;

		while (a <= 200) {
			b = a * a * a;
			c -= b;
			a++;
		}
		System.out.println("Разность кубов первых двухсот чисел = " + c);

	}

}
