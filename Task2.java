package by.epam.introduction.basic;

/* Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения): 
 * (𝑏 + √𝑏2 + 4𝑎𝑐 ) / 2a -  𝑎3𝑐 + 𝑏−2
*/

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 5;
		int c = 3;
		
		double x;
		
		x = (b + Math.sqrt(Math.pow(b, 2) + 4.0*a*c))/2.0*a - Math.pow(a, 3)*c + Math.pow(b, -3);
		
		System.out.println(x);

	}

}
