package by.htp.les04.main;
//4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.

public class Task4 {

	public static void main(String[] args) {
		int a = 2;
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}
}
