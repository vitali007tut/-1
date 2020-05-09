package by.epam.introduction.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class Task3_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("Введите символ = ");
			String s = reader.readLine();
			if (s.isEmpty())
				break;
			char ch = s.charAt(0); // возвращаем символ от первого элемента строки
			System.out.println("Двоичный код = " + Integer.toBinaryString(ch));
		}

	}

}
