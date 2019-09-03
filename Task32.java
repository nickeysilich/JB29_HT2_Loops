package by.htp.les04.main;

import java.util.Scanner;

/* 32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами
и знаком подчеркивания.*/

public class Task32 {

	public static void main(String[] args) {
		int a;
		char ch;
		String ch1;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите строку > ");
		ch1 = sc.nextLine();

		a = (int) ch1.charAt(0);
		for (int i = 48; i <= 57; i++) {
			if (a == i) {

				ch = (char) a;
				System.out.println("Введён недопустимый символ " + ch);
			}

		}

	}

}
