package by.htp.les04.main;
//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {

	public static void main(String[] args) {
		long c = 1;
		long res = 1;
		long b = 2;

		while (b <= 10) {
			c += b;
			res *= c;
			b++;
			System.out.println(res);

		}
		System.out.println("Выражение равно = " + res);
	}

}
