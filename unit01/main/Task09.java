package by.ld.unit01.main;

//вычислить значение выражения по формуле

public class Task09 {
	public static void main(String[] agrs) {
		double a, b, c, d;
		double x=0;
		
		a=111;
		b=80;
		c=50;
		d=23;
		
		x = ((a/c) * (b/d)) - ((a*b - c)/(c * d));
		
		System.out.println("x = " + x);
		
	}

}
