package by.htp.les04.main;
/*22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции*/

import java.util.Scanner;

import static java.lang.Math.*;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc;
        double a;
        double b;
        double h;
        double fx;
        double x;

        sc = new Scanner(System.in);
        System.out.println("Введите A");
        a = sc.nextDouble();
        System.out.println("Введите B");
        b = sc.nextDouble();
        System.out.println("Введите шаг h");
        h = sc.nextDouble();
        System.out.println("x " + " " + "f(x)\n");

        for (double i = a; i <= b; i += h) {
            x = i;
            x = toRadians(x);
            fx = Math.pow(toDegrees(sin(x)), 2);
            System.out.println(x + " " + fx + "\n");
        }
    }
}
