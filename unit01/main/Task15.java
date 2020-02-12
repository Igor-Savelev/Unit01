package by.ld.unit01.main;

//Написать программу, которая выводит на экран первые четыре степени числа π. 

public class Task15 {
	public static void main(String[] agrs) {
		double pi1, pi2, pi3, pi4;
		
		pi1= Math.pow(Math.PI, 1);
		pi2= Math.pow(Math.PI, 2);
		pi3= Math.pow(Math.PI, 3);
		pi4= Math.pow(Math.PI, 4);
		
		System.out.println("Число pi в первой степени = " + pi1);
		System.out.println("Число pi в второй степени = " + pi2);
		System.out.println("Число pi в третьей степени = " + pi3);
		System.out.println("Число pi в четвёртой степени = " + pi4);
		
	}

}
