package by.epam.introduction.basic;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = (long) Math.pow(1, 2);
		
		for (int i = 2; i <= 200; i++) {
			sum *= Math.pow(i, 2);
		}
		
		System.out.println("Произведение квадратов первых двухсот чисел = " + sum);

	}

}
