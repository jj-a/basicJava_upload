package oop1116;

public class IfTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - IfTest2 ]"+"\n");
		
		// �������α׷�
		
		String name="ȫ�浿";
		int kor=85, eng=35, mat=90;
		int avr=(kor+eng+mat)/3;
		
		
		System.out.println("�̸�: "+name);
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+mat);
		System.out.println("���: "+avr);
		System.out.println();
		
		
		// lab1.��� 95�̻� ���л� ����
		System.out.println("[lab1] ���л� ����");
		
		if(avr>=95) System.out.println(name+"���� ���л��Դϴ�.");
		else System.out.println(name+"���� ���л� ����� �ƴմϴ�.");
		System.out.println();
		
		
		// lab2. ������ ����
		// ���� 90���� A / 80���� B / 70���� C / 60���� D / 50�� ���� F
		System.out.println("[lab2] ������ Ȯ��");

		char grade;
			
		if(kor>=90) grade='A';
		else if(kor>=80) grade='B';
		else if(kor>=70) grade='C';
		else if(kor>=60) grade='D';
		else grade='F';
		
		System.out.println(name+"���� ���� ���: "+grade);
		System.out.println();
		
		
		// lab3. ���� üũ�ϱ�
		// ��� 70�� �̻� �հ�, �� 1�����̶� 40�� �̸��� �� �����, ��� 70�� �̸� ���հ�
		System.out.println("[lab3] �հݿ��� üũ�ϱ� (�հ�/�����/���հ�)");
		
		String result;
		
		if(avr>=70) {
			/*
			if(kor<40||eng<40||mat<40) result="�����";
			else result="�հ�";
			*/
			
			if(kor>=40&&eng>=40&&mat>=40) result="�հ�";
			else result="�����";
			
		}
		else result="���հ�";

		System.out.println(name+"���� "+result+"�Դϴ�.");
		System.out.println();
		
		
		// lab4. ���� ���� ���α׷�
		System.out.println("[lab4] ���� ���� ���α׷�");
		
		int a=3, b=5;
		char op='/';
		
		System.out.print(a+" "+op+" "+b+" = ");
		
		if(op=='+') System.out.println(a+b);
		else if(op=='-') System.out.println(a-b);
		else if(op=='*') System.out.println(a*b);
		else if(op=='/') System.out.println((double)a/b);
		else if(op=='%') System.out.println(a%b);

		System.out.println();
		
		
		
	}
}
