package by.ld.unit01.main;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. 

public class Task14 {
	public static void main(String[] agrs) {
		double R; //радиус окружности
		double L; //длина окружности
		double S; // площадь круга
		
		R=15;
		
		L= 2 * Math.PI * R;
		S= Math.PI * R * R;
		
		System.out.println("Длина окружности L = " + L);
		System.out.println("Площадь круга S = " + S);
		
	}

}
