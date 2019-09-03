package by.htp.les04.main;

//9. Найти сумму квадратов первых ста чисел.
public class Task9 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		a = 1;
		c = 0;

		while (a <= 100) {
			b = a * a;
			c += b;
			a++;
		}
		System.out.println("сумма квадратов первых ста чисел = " + c);

	}

}
