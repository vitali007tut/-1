package by.epam.introduction.basic;

import java.util.Scanner;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие. 
 */
public class Task2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 2;
		b = 8;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размеры кирпича");
		System.out.print("x = ");
		x = sc.nextInt();
		System.out.print("y = ");
		y = sc.nextInt();
		System.out.print("z = ");
		z = sc.nextInt();

		String s = "Кирпич НЕ пройдёт в прямоугольное отверстие";

		if ((a >= x || a >= y) && (b >= x || b >= y))
			s = "Кирпич пройдёт в прямоугольное отверстие";

		if ((a >= x || a >= z) && (b >= x || b >= z))
			s = "Кирпич пройдёт в прямоугольное отверстие";

		if ((a >= y || a >= z) && (b >= y || b >= z))
			s = "Кирпич пройдёт в прямоугольное отверстие";

		System.out.println(s + " размера " + a + " на " + b);

	}

}
