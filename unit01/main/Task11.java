package by.ld.unit01.main;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

public class Task11 {
	public static void main(String[] agrs) {
		double a, b; //катеты
		double с=0; //гипотенуза
		double p=0; //периметр
		double s=0; //площадь
		
		a=4;
		b=3;
		
		с = Math.sqrt(a*a + b*b);
		p = a + b + с;
		s = (a * b)/2;
		
		System.out.println("Периметр = " + p);
		System.out.println("Площадь = " + s);
	}

}
