package oop1115;

public class OperatorTest3 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OperatorTest3 ]"+"\n");
		
		
		int a=4;
		System.out.println(a%2==0);
		
		//System.out.println(a%0!=1);
		System.out.println();
		
		
		// lab1. ���� ���� Ȯ��
		System.out.println("[lab1] ���� Ȯ���ϱ�");
		
		int year=2018;
		System.out.println(year+"�� ���� ����: "+(year%4==0));
		System.out.println();
		
		
		// lab2. ������ ���� 2�� ����̸鼭 5�� ������� ����
		System.out.println("[lab2] 2�� 5�� ����� ����");
		
		int b=15;
		
		System.out.println(b+" = "+((b%2==0)&&(b%5==0)));
		System.out.println();
		
		
		// lab3. ���� ������ 80~89 �������� ����
		System.out.println("[lab3] �������� 80���� ����");
		
		int kor=85;

		System.out.println((kor>=80)&&(kor<=89));
		System.out.println();
		
		
		// lab4. ġ������ ����� ���� ���
		System.out.println("[lab4] ġ���� ����� ���� ���");
		
		year=2200;
		boolean leap=( year%4==0 && ( year%100!=0 || year%400==0 ) );
		//  4�⸶�� ����,  100�� ������ ���,  �� 400�� ������ ����
		// year%4==0 && ( year%100!=0 || year%400==0 )
		
		System.out.println(year+"�� ���⿩��: "+leap);
		System.out.println();
		
		
		// lab5. ������ ���ڰ� ���ĺ� R, r ���� ����
		System.out.println("[lab5] ���ĺ� R(r) ���� Ȯ��");
		
		char c='a';
		boolean result=c=='R'||c=='r';
		
		System.out.println(c+"= "+result);
		System.out.println();
		

		// lab5. 2�� ����̰ų� 3�� ������� ����
		System.out.println("[lab5] 2�� ����̰ų� 3�� ����� �� ã��");
		
		int num=9;
		System.out.println(num+"= "+(num%2==0 || num%3==0));
		System.out.println();
		

		// lab6. �빮�� ����
		System.out.println("[lab6] �빮�� ���� Ȯ��");
		
		c='G';
		result=c>='A'&&c<='Z';
		
		System.out.println(c+"= "+result);
		System.out.println();
		

		// lab7. 3�� ����� �ƴ� �� Ȯ��
		System.out.println("[lab7] 3�� ����� �ƴ� �� => true");
		
		num=6;
		System.out.println(num+"= "+(num%3!=0));
		
		
		
	}
}
