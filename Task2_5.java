package by.epam.introduction.basic;

import java.util.Scanner;

/* Вычислить значение функции: 
 * F(x) = x*x - 3x + 9 if x<=3
 * F(x) = 1 / (x*x*x + 6) if x>3
 */
public class Task2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		double x = sc.nextDouble();

		double f;
		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("x <= 3 , f(x)= " + f);
		} else {
			f = 1.0 / (Math.pow(x, 3) + 6);
			System.out.println("x > 3 , f(x)= " + f);
		}

	}

}
