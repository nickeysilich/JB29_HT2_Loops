package by.htp.les04.main;
//10. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task10 {

	public static void main(String[] args) {
		long a;
		long b;
		long c;
		
		a = 1;
		c = 1;
		
		while (a <= 200) { //После 33 вышло за пределы диапазона 10 раз и выдало 0 (слишком большое число)
			b = a * a;
			c *= b;
			a++;
		}
		System.out.println("Произведения квадратов первых двухсот чисел = " + c);

	}

}
