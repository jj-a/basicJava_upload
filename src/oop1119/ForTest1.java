package oop1119;

public class ForTest1 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ForTest1 ]"+"\n");
		
		
		for(int i=10;i<=100;i++) System.out.print(i+"JAVA ");
		System.out.println();
		for(int i=100;i>=10;i-=10) System.out.print(i+"JSP ");
		
		
		// ������ �ݺ���
		System.out.println();
		for(char c='A';c<='Z';c++) System.out.print(c);
		System.out.println();

		
		//�ڱ����ܡ�
		System.out.println("\n\n[������]");
		
		for(int i=2;i<=9;i++) {
			System.out.print(i+"��> ");
			for(int j=1;j<=9;j++) System.out.print(i+"*"+j+"="+i*j+"  ");
			System.out.println();
		}
		
		// 1~5�� ¦���� ���
		System.out.println("\n\n[1~5�� ¦�� ���]");
		
		for(int i=1;i<=5;i++) {
			if(i%2==0) System.out.print(i+" ");
		}
		System.out.println();

		
		// 1~5 �� ¦���� ���� ���
		System.out.println("\n\n[1~5 �� ¦���� ���� ���]");
		
		int cnt=0;
		for(int i=1;i<=5;i++) if(i%2==0) cnt++;
		System.out.println("¦�� ����: "+cnt);
		

		// AC1~2018�� �� ���� ����ϱ�
		System.out.println("\n\n[��������� ����]");
		int year=2018;
		int segi=1;
		System.out.print(segi+"����) ");
		for(int i=1;i<=year;i++) {
				if(i/100!=segi-1) {				//do while���� �� ������ �˰���
					segi++;
					System.out.print("\n"+segi+"����) ");
				}
				if(i%4==0&&i%100!=0||i%400==0) System.out.print(i+"�� ");
		}
		
		System.out.println();
		

		// AC1~2018�� �� ���� ��� ���ϱ�
		System.out.println("\n\n[��������� ���� ���]");
		year=2018;
		cnt=0;
		for(int i=1;i<=year;i++) {
			if(i%4==0&&i%100!=0||i%400==0) cnt++;
		}
		System.out.println("1~2018�� �� ������ ��: "+cnt+"(��)");
		
		
		//���ĺ� ���ٿ� 5���� ���
		System.out.println("\n\n[���ĺ� ���ٿ� 5���� ���]");
		
		for(char i='A';i<='Z';) {	
			for(int j=1;j<=5;j++) {
				System.out.print(i);
				i++;
				if(i>'Z') break;			//do while���� �� ������ �˰���
			}
			System.out.println();
		}
		
		
		
		// �� ���̾Ƹ�� ��		
		System.out.println("\n\n�� ���̾Ƹ�� ��\n");
		
		for(int i=0;i<10;i++) {
			for(int j=10;j>i;j--) System.out.print("��");
			for(int j=0;j<=i;j++) System.out.print("��");
			for(int j=0;j<=i;j++) System.out.print("��");
			for(int j=10;j>i;j--) System.out.print("��");
			System.out.println();
		}

		for(int i=1;i<10;i++) {
			for(int j=0;j<=i;j++) System.out.print("��");
			for(int j=10;j>i;j--) System.out.print("��");
			for(int j=10;j>i;j--) System.out.print("��");
			for(int j=0;j<=i;j++) System.out.print("��");
			System.out.println();
		}
		
		System.out.println();
		
	}
}
