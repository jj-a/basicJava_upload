package oop1116;

public class OperatorTest5 {
	public static void main(String[] args) {

		System.out.println("[ JJA - OperatorTest5 ]"+"\n");
		
		int a=3;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		int b=3;
		System.out.println(b);
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		System.out.println();
		
		
		a=10;
		b=10;
		int c=a++;		//������ ������ ���� (10)
		int d=--b;		//������ �� ���� (9)
		

		System.out.println("a="+a+" b="+b);
		System.out.println("c="+c+" d="+d);
		System.out.println();
		
		int x=3;
		int y=5;
		int z=(++x)+(y++);	//������ x��(4) + ������ y��(5) = (9)
		
		System.out.println("x="+x+" y="+y);
		System.out.println("z="+z);
		
		
		
	}
}
