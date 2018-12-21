package oop1116;

public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - SwitchTest ]"+"\n");
		
		int n=10;
		String s=null;
		
		switch(n) {
		case 10: s="SEOUL"; break;
		case 20: s="JEJU"; break;
		case 30: s="BUSAN"; break;
		default: s="etc";
		}
		
		System.out.println(s);
		System.out.println();
		

		// lab1. ������ ����
		// ���� 90���� A / 80���� B / 70���� C / 60���� D / 50�� ���� F
		System.out.println("[lab1] ������ Ȯ��");
		
		int kor=85;
		char grade;
		
		System.out.println("���� ����: "+kor);
		
		switch(kor/10) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		
		System.out.println("���� ���: "+grade);
		System.out.println();
		
		
		// lab2. ���� ���� ���α׷�
		System.out.println("[lab2] ���� ���� ���α׷�");
		
		int a=3, b=5;
		char op='/';
		
		System.out.print(a+" "+op+" "+b+" = ");
		
		switch(op) {
		case '+': System.out.println(a+b); break;
		case '-': System.out.println(a-b); break;
		case '*': System.out.println(a*b); break;
		case '/': System.out.println((double)a/b); break;
		case '%': System.out.println(a%b); break;
		}
		
		System.out.println();
		
		
		// lab3. �����ڵ�� ���� ���а� ���� ���ϱ� (1,3,5=���� / 2,4,6=����)
		// 1900��� �ֹι�ȣ �����ڵ� 1,2  /  2000��~ �ֹε�Ϲ�ȣ �����ڵ� 3,4 / �ܱ��� 5,6
		System.out.println("[lab3] �ֹι�ȣ�� ���� �ڵ�� ���� ���� + ���� �˾ƺ���");
		int x=4;
		int birthyy=15;
		int birthyyyy=0, age=0;
		String resultstr;
		
		System.out.println("x="+x+" birthyy="+birthyy);
		
		switch(x) {
		case 1: case 3: case 5: resultstr="����"; break;
		case 2: case 4: case 6: resultstr="����"; break;
		default: resultstr="ǥ�� ����";
		}
		
		System.out.println("�ش� �ڵ�� ["+resultstr+"]�Դϴ�.");
		
		switch((x+1)/2) {
		case 1: birthyyyy=1900+birthyy; break;
		case 2: birthyyyy=2000+birthyy; break;
		default: System.out.println("�ܱ��� (���Ұ�)");
		}
		
		age=2018-birthyyyy+1;		// �ѱ����� ����
		
		System.out.print("����: "+birthyyyy+"�� / ");
		System.out.println("����: "+age+"��");
		
		
		System.out.println();
		
		
		
	}
}
