package by.epam.introduction.basic;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 /𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦)*𝑡𝑔 𝑥𝑦
 */

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x;
		double y;
		double z;

		x = 6;
		y = 10;

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println(z);

	}
}
