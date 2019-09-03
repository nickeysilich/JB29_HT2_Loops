package by.htp.les04.main;
//39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.

public class Task39 {

	public static void main(String[] args) {

		int a;
		int x;

		
		for (int b = 100; b < 1000; b++) {
			a = b /100;
			x = b - (a * 100);
			
				if (x * 7 == b) {
					System.out.println("найденное число:" + b);
				}
				a /= 10;
			}

		}

	}

