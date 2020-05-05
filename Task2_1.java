package by.epam.introduction.basic;

/*Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
 */
public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alfa = 150;
		int beta = 45;
		int gamma;
		gamma = 180 - alfa - beta;

		if (gamma > 0) {
			System.out.print("Треугольник существует");
			if (alfa == 90 || beta == 90 || gamma == 90)
				System.out.println(" -- является прямоугольным");
		} else
			System.out.println("Треугольник не существует");

	}

}
