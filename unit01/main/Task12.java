package by.ld.unit01.main;

//��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)� (x2, �2). 

public class Task12 {
	public static void main(String[] agrs) {
		double x1,y1; //���������� ������ �����
		double x2,y2; // ���������� ������ �����
		double s=0; // ���������� ����� ����� �������
		
		x1=2;
		y1=3;
		x2=4;
		y2=6;
		
		s= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("���������� ����� ����� ������� s = " + s);
	}

}
