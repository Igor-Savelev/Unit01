package by.ld.unit01.main;

//вычислить значение выражения по формуле

public class Task08 {
	public static void main(String[] agrs) {
		double a, b, c;
		double sqrt;
		double x=0;
		
		a=7;
		b=2;
		c=5;
		
		sqrt = Math.sqrt(b*b + 4 * a * c);
		x= ((b + sqrt) / 2*a) - a*a*a*c + Math.pow(b, -2);
		
		System.out.println("x = " + x);
	}

}
