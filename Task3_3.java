package by.epam.introduction.basic;

//  Найти сумму квадратов первых ста чисел.

public class Task3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; i++)
			sum += Math.pow(i, 2);

		System.out.println("Cумма квадратов первых ста чисел равна " + sum);

	}

}
