package by.epam.introduction.basic;

// Найти max{min(a, b), min(c, d)}

public class Task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		a = 5;
		b = 10;
		c = 100;
		d = -100;

		System.out.println(max(min(a, b), min(c, d)));

	}

	public static int min(int a, int b) {
		int min = a < b ? a : b;
		return min;
	}

	public static int max(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}

}
