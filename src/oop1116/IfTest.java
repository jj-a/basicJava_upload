package oop1116;

public class IfTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - IfTest ]"+"\n");
		
		int x=0, y=0;
		String resultstr;
		int result;
		
		// lab1. ����/���/0 ����
		System.out.println("[lab1] ����/���/0 ���� Ȯ��");
		
		x=0;
		System.out.println("x="+x);
		
		
		if(x>0) resultstr="���";
		else if(x<0) resultstr="����";
		else resultstr="0";

		System.out.println("x�� ["+resultstr+"]�Դϴ�.");
		System.out.println();

		
		// lab2. ���밪 ���
		System.out.println("[lab2] ���밪 ����ϱ�");
		
		x=-11;
		System.out.println("x="+x);
		
		if(x<0) result=-x;
		else result=x;
		
		System.out.println(x+"�� ���밪�� ["+result+"]�Դϴ�.");
		System.out.println();
		
		
		// lab3. �� ���� ����
		System.out.println("[lab3] �� ���� ���� ���ϱ�");
		x=5;
		y=9;
		
		System.out.println("x="+x+" y="+y);
		
		if(x>y) result=x-y;
		else result=y-x;
		
		System.out.println("�� ���� ���̴� ["+result+"]�Դϴ�.");
		System.out.println();
		
		
		// lab4. �����ڵ�� ���� ���� (1,3,5=���� / 2,4,6=����)
		System.out.println("[lab4] �ֹι�ȣ�� ���� �ڵ�� ���� ����");
		x=2;
		
		System.out.println("x="+x);
		
		if(x==1||x==3||x==5) resultstr="����";
		else if(x==2||x==4||x==6) resultstr="����";
		else resultstr="ǥ�� ����";
		
		System.out.println("�ش� �ڵ�� ["+resultstr+"]�Դϴ�.");
		System.out.println();
		
		 
		
		
	}
}
