package by.htp.les04.main;
/*37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе
на 49.*/

public class Task37 {

	public static void main(String[] args) {

		int a;
		int b;
		int x;
		int y;

		for (int i = 10; i <= 99; i++) {

			for (int j = 10; j <= 99; j++) {

				x = i * 100 + j;
				y = j * 100 + i;

				if (x % 99 == 0 && y % 49 == 0) {
					System.out.println("x = " + x + "\n" + "y = " + y);

				}

			}
		}
	}
}