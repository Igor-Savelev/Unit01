package by.ld.unit01.main;

//Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника 

public class Task07 {
	public static void main(String[] agrs) {
		double a; //ширина прямоугольника
		double b; //длина прямоугольника
		double s; //площадь прямоугольника

		a = 7;
		
		b = 2 * a;
		s = a * b;
		
		System.out.println("Площадь прямоугольника = " + s);	
	}

}
