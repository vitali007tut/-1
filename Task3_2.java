package by.epam.introduction.basic;

import java.util.Scanner;

/* Вычислить значения функции на отрезке [а,b] c шагом h: 
 * y = x if x >2
 * y = -x if x <= 2
 */
public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Задайте отрезок [а,b] и шаг h");

		int a;
		int b;
		int h;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("h = ");
		h = sc.nextInt();
		
		for (int i = a; i <= b; i += h) {
			if (i<=2)
				System.out.print(-i + " ");
			else
				System.out.print(i + " ");
		}

	}

}
