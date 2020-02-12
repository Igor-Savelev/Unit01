package by.ld.unit01.main;

//Заданы координаты трех вершин треугольника  (х1, у1),(х2, у2),(х3, у3). Найти его периметр и площадь. 

public class Task13 {
	public static void main(String[] agrs) {
		double x1,y1; //координаты первой вершины
		double x2,y2; //координаты второй вершины
		double x3,y3; //координаты третьей вершины
		double a,b,c=0; //стороны треугольника
		double p=0; //периметр
		double per=0; //полупериметр
		double s=0; //площадь
		
		x1=12;
		y1=7;
		x2=15;
		y2=10;
		x3=16;
		y3=22;
		
		a= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		b= Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		c= Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
		
		p= a + b + c;
		per= p/2;
		s= Math.sqrt(per * (per - a) * (per - b) * (per - c));
		
		System.out.println("Периметр треугольника p = " + p);
		System.out.println("Площадь треугольника s = " + s);

	}

}
