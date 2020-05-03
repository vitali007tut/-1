package by.epam.introduction.basic;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности 
 * в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 126585; // время в секундах
		int h;
		int m;
		int s;
		int mm;

		mm = t / 60; // всего минут
		h = mm / 60; // часы
		m = mm - h * 60; // минуты
		s = t - mm * 60; // оставшиеся секунды

		System.out.println(h + "ч " + m + "мин " + s + "cек");

	}

}
