package by.ld.unit01.main;

//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2). 

public class Task12 {
	public static void main(String[] agrs) {
		double x1,y1; //координаты первой точки
		double x2,y2; // координаты второй точки
		double s=0; // расстояние между двумя точками
		
		x1=2;
		y1=3;
		x2=4;
		y2=6;
		
		s= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("Расстояние между двумя точками s = " + s);
	}

}
