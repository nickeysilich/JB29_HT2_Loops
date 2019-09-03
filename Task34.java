package by.htp.les04.main;
//34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {
		int a;
        int b;
        int c;
        int d;
        int e;
        
        System.out.println("Все четерыхзнаяные чяисла сумма цифр каждого из которых равно 15:");
        
        for (int i=1000; i<=9999; i++){

            a = i/1000;
            b = (i/100)%10;
            c = (i/10)%10;
            d = i%10;
            e = a + b + c +d;

            if (e==15){
                System.out.println("\n" +  + i );
            }
        }

	}

}
