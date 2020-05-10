package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task3_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите первое число = ");
		String a = reader.readLine();
		System.out.print("Введите второе число = ");
		String b = reader.readLine();

		for (int i = 0; i < a.length(); i++)
			for (int j = 0; j < b.length(); j++)

				if (a.charAt(i) == b.charAt(j)) {
					System.out.print(a.charAt(i) + " ");
				}

	}

}
