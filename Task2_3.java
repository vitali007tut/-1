package by.epam.introduction.basic;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */
public class Task2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 4;
		y1 = 3;
		x2 = 0;
		y2 = 0;
		x3 = -33;
		y3 = -2;

		double k1 = (double) (y1 - y2) / (x1 - x2);
		double k2 = (double) (y1 - y3) / (x1 - x3);

		String result = k1 == k2 ? "Точки на одной линии" : "Точки НЕ на одной линии";
		
		System.out.println(result);

	}

}
