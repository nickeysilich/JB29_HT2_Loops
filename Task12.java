package by.htp.les04.main;
/*12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , 
для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.*/

public class Task12 {

	public static void main(String[] args) {

		int a1;
		int an;
		int a;
		int proiz;

		a1 = 1;
		a = 2;
		proiz = 1;

		while (a <= 11) {
			an = 6 + (a1);
			a1 = an;
			proiz *= an;
			a++;
		}
		System.out.println(proiz);
	}

}
