package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид: a(n) = 1/2^n + 1/3^n
 */

public class Task3_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Задайте число е = ");
		double e = Double.parseDouble(reader.readLine());
		double sum = 0;
		double a;
		
		for (int i = 1; i < 100 ; i++) {
			a = 1/Math.pow(2, i) + 1/Math.pow(3,i);
			if (a >= e)
				sum += a;
		}
		
		System.out.println(sum);

	}

}
