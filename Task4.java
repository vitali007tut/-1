package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Введите действительное число вида nnn.ddd");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(reader.readLine());

		int x;
		int y;
		x = (int) ((R * 1000) % 1000);
		y = (int) (R - x / 1000);
		System.out.println("Поменяем местами дробную и целую части числа");
		System.out.println(x + "." + y);
	}

}
