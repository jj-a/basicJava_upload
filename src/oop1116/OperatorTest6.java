package oop1116;

public class OperatorTest6 {
	public static void main(String[] args) {

		System.out.println("[ JJA - OperatorTest6 ]"+"\n");
		
		
		// ���׿�����
		
		// lab1. ����/��� ����
		System.out.println("[lab1] ����/��� ���� Ȯ��");
		
		int x=9;
		System.out.println("x="+x);
		String result = (x>=0) ? "���" : "����";
		System.out.println(x+"��(��) "+result+"�Դϴ�.");
		System.out.println();
		
		
		// lab2. ¦��/Ȧ�� ����
		System.out.println("[lab2] ¦��/Ȧ�� ���� Ȯ��");

		x=21;
		System.out.println("x="+x);
		result= (x%2==0) ? "¦��" : "Ȧ��";
		System.out.println(x+"��(��) "+result+"�Դϴ�.");
		System.out.println();
		
		
		// lab3. 2�� 5�� ����� ����
		System.out.println("[lab3] 2�� 5�� ����� ���� Ȯ��");

		x=30;
		System.out.println("x="+x);
		result= (x%2==0&&x%5==0) ? "2�� 5�� �������" : "2�� 5�� ������� �ƴ�";
		System.out.println(x+"��(��) "+result+"�ϴ�.");
		System.out.println();
		
		
		// lab4. ����/��� ����
		System.out.println("[lab4] ����/��� ���� Ȯ��");

		x=2100;
		System.out.println("x="+x+"(��)");
		result= ((x%4==0)&&(x%100!=0||x%400==0)) ? "����" : "���";
		System.out.println(x+"���� "+result+"�Դϴ�.");
		System.out.println();
		
		
		// lab5. ��ҹ��� �ٲ� ���
		System.out.println("[lab5] ���ĺ� ��ҹ��� �ٲ� ���");

		char c='a';
		System.out.println("c= "+c);
		result= (c<'a') ? (char)(c+32)+"" : (char)(c-32)+"";
		System.out.println(c+" => "+result);
		System.out.println();
		
		
		// lab6. �ִ밪 ���
		System.out.println("[lab6] �ִ밪 ã��");

		int y,z;
		x=3;
		y=9;
		z=7;
		
		System.out.println("x="+x+" y="+y+" z="+z);
		int max= (x>y&&x>z) ? x : (y>z ? y : z);
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		System.out.println();
		
		
		
	}
}
