package by.ld.unit01.main;

//������ ���������� ���� ������ ������������  (�1, �1),(�2, �2),(�3, �3). ����� ��� �������� � �������. 

public class Task13 {
	public static void main(String[] agrs) {
		double x1,y1; //���������� ������ �������
		double x2,y2; //���������� ������ �������
		double x3,y3; //���������� ������� �������
		double a,b,c=0; //������� ������������
		double p=0; //��������
		double per=0; //������������
		double s=0; //�������
		
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
		
		System.out.println("�������� ������������ p = " + p);
		System.out.println("������� ������������ s = " + s);

	}

}
