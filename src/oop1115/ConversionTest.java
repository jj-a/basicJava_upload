package oop1115;

public class ConversionTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ConversionTest ]"+"\n");
		
		// �ڵ� ����ȯ
		
		byte a=3;
		int b=a;
		long c=b;
		double d=c;
		
		
		System.out.println("byte�� = "+a);
		System.out.println("byte->int ����ȯ = "+b);
		System.out.println("int->long ����ȯ = "+c);
		System.out.println("long->double ����ȯ = "+d);
		System.out.println();
		
		float f=4.5f;
		double g=f;

		System.out.println("float�� = "+f);
		System.out.println("float->double ����ȯ = "+g);
		System.out.println();
		
		
		// ���� ����ȯ (Cast)
		
		System.out.println((int)3.5);
		System.out.println((double)4);
		System.out.println((int)3.6+(int)4.7);
		System.out.println((int)(3.6+4.7));
		System.out.println();
		
		
		//����ȯ ����
		
		int kor=80, eng=90, mat=75;
		
		double avr1=(kor+eng+mat)/3;
		double avr2=(kor+eng+mat)/3.0;
		double avr3=(double)(kor+eng+mat)/3;
		
		System.out.println(avr1);
		System.out.println(avr2);
		System.out.println(avr3);
		
		
	}
}
