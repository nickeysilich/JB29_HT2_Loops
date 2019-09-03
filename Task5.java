package by.htp.les04.main;
//5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.

public class Task5 {

	public static void main(String[] args) {
		int a;
		int sum;

		a = 0;
		sum = 0;

		while (a <= 99) {
			if (a % 2 != 0) {
				System.out.println(a);
				sum += a;
			}
			a++;
		}
		System.out.println("Сумма нечетных чисел от 0 до 99" + sum);
	}
}
