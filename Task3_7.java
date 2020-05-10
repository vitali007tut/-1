package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Для каждого натурального числа в промежутке от m до n вывести 
 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
 */
public class Task3_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Задайте промежуток от m до n");
		System.out.print("m = ");
		int m = Integer.parseInt(reader.readLine());
		System.out.print("n = ");
		int n = Integer.parseInt(reader.readLine());

		int d; // переменная для проверки отсутствия делителей
		for (int i = m; i <= n; i++) { // перебор в промежутке
			d = 0;
			System.out.print("Делители для числа " + i + " : ");
			for (int j = 2; j < i; j++) { // перебор для поиска делителей
				if (i % j == 0) {
					d = j;
					System.out.print(j + " ");
				}
			}
			if (d == 0) {
				System.out.print("отсутствуют(");
			}
			System.out.println();
		}

	}

}
