package oop1119;

public class ForTest3 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest3 ]"+"\n");
		
		
		// 10���κ��� ������ x���� n�� �� �� ���� ������ �Ǹ� ���̳ʽ��� Ƚ�� ���
		System.out.println("[lab1] ���̳ʽ� Ƚ�� ����ϱ�");
		
		int x=1;
		int cnt=0;
		
		for(int i=10;i>-1;) {
			i-=x;
			cnt++;
		}
		
		System.out.println("x="+x);
		System.out.println("10���� ���̳ʽ��� Ƚ�� : "+cnt+"ȸ");
		
		
		
		//  ������ ��=3cm up,  ��=2.5cm down, 13cm ��������⿡ �ö󰡴µ� �ɸ��� ��¥ 
		System.out.println("\n\n[lab2] �����̰� ������������ �ö󰡴µ� �ɸ��� ��¥");
		
		int day;
		double up=3, down=2.5;
		double top=13;
		double count=0;
		
		for(int i=1;true;i++){
			count+=up;
			if(count>=top){
				day=i; 
				break;
			}
			count-=down;
		}
		
		System.out.println("���� ����="+top+"(cm)");
		System.out.println("�ҿ䳯¥ : "+day+"��");
		
		
		
		// 1-2+3-4+5 ... 100 = +Ȧ��-¦�� ���� �� ���ϱ�
		System.out.println("\n\n[lab3] '+Ȧ��-¦��' ���� �� ���ϱ�");
		
		int sum=0;
		for(int i=1;i<=100;i++) {		// Ȧ/¦���� ����
			if(i%2==0) sum-=i;	
			else sum+=i;
		}
		
		System.out.println("1-2+3-4+5 ... 100 = "+sum);	// ��ü�� s�϶�, (s/2)*-1
		
		
		
		// (1/2)-(2/3)+(3/4)-(4/5)+(5/6)...(99/100) ���� �� ���ϱ�
		System.out.println("\n\n[lab4] �м� +/- �ݺ� ���� �� ���ϱ�");

		boolean plus=true;		// switch
		double result=0;
		
		for(int i=1;i<100;i++) {		// switch��� �̿�
			double j=i+1;
			if(plus==true) result+=(i/j);
			else result-=(i/j);
			plus=!plus;
		}
		
		System.out.println("(1/2)-(2/3)+(3/4)-(4/5)+(5/6)...(99/100) = "+result);
		
		
		
		// �� �� ������ �� ���ϱ�
		System.out.println("\n\n[lab5] �� �� ������ ��");
		
		int a=5, b=3;
		sum=0;
		
		if(a<b) {
			for(int i=a;i<=b;i++) sum+=i;
		}
		else {
			for(int i=a;i>=b;i--) sum+=i;
		}
		
		System.out.println(a+"~"+b+"�� �� = "+sum);
		
		
		
	}
}
