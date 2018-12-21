package oop1119;

public class ForTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest2 ]"+"\n");
		
		//¦���� �� ���ϱ�
		System.out.println("[¦���� �� ���ϱ�]");

		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1~10 ¦���� �� = "+sum);

		
		//Ȧ���� �� ���ϱ�
		System.out.println("\n\n[Ȧ���� �� ���ϱ�]");

		sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) sum+=i;
		}
		System.out.println("1~100 Ȧ���� �� = "+sum);
		
		
		// 4 Factorial �� ���ϱ�
		System.out.println("\n\n[4 Factorial ���ϱ�]");
		
		int n=4;
		int fac=1;
		for(int i=n;i>0;i--) fac*=i;
		System.out.println(n+"!="+fac);
		

		// 1~100 ���̿��� ¦���� ��, Ȧ���� �� ���� ���ϱ�
		System.out.println("\n\n[¦���� ��, Ȧ���� ��-1]");
		
		int sum1=0, sum2=0;
		n=100;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) sum2+=i;
			else sum1+=i;
		}
		
		System.out.println("��� ��� = 1~"+n);
		System.out.println("¦���� �� = "+sum2);
		System.out.println("Ȧ���� �� = "+sum1);
		

		// 1~100 ���̿��� ¦���� ��, Ȧ���� �� ���� ���ϱ� (Switch���-true/false)
		System.out.println("\n\n[¦���� ��, Ȧ���� ��-2]");
		
		boolean flag=false;
		sum1=0;
		sum2=0;
		n=100;
		
		for(int i=1;i<=n;i++) {
			if(flag) sum2+=i;
			else sum1+=i;
			flag=!flag;
		}
		
		System.out.println("��� ��� = 1~"+n);
		System.out.println("¦���� �� = "+sum2);
		System.out.println("Ȧ���� �� = "+sum1);
		

	}

}
