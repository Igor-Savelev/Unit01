package by.ld.unit01.main;

// Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное. 

public class Task01 {
	public static void main(String[] agrs) {
		
		double x, y;
		double sum=0;
		double sub=0;
		double mul=0;
		double div=0;
				
		x = 55;
		y = 21;
		
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = x/y;
		
		System.out.println("Сумма = " + sum);
		System.out.println("Разность = " + sub);
		System.out.println("Произведение = " + mul);
		System.out.println("Частное = " + div);
				
	}

}
