package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа. 
 */
public class Task3_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Введите целое положительное число ");
		int n = Integer.parseInt(reader.readLine());

		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		System.out.printf("Сумма всех чисел от 1 до %d равна %d.", n, sum);

	}

}
