package by.ld.unit01.main;

//вычислить значение выражения по формуле 

public class Task10 {
	public static void main(String[] agrs) {
		double x, y;
		double m=0;
		double z=0;
		
		x=42;
		y=33;
		
		m= x * y;
		z= ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(m);
		
		System.out.println("z = " + z);
	}

}
