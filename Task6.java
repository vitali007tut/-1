package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Для данной области составить линейную программу, 
 * которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае: 
 */
public class Task6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите координаты точки:");
		System.out.println("x = ");
		int x = Integer.parseInt(reader.readLine());
		System.out.println(" y = ");
		int y = Integer.parseInt(reader.readLine());

		boolean b;
		if (x >= -2 && x <= 2 && y >= 0 && y <= 4 || x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			b = true;
		} else
			b = false;

		System.out.println(b);

	}

}
