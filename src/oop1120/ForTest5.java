package oop1120;

public class ForTest5 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest5 ]"+"\n");
		
		int i=0, j=0;
		for(i=1;i<=2;i++) {
			for(j=1;j<=3;j++) {
				System.out.print("jsp");
			}
			System.out.println("java");
		}
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);

		
		//�ڱ����ܡ�
		System.out.println("\n\n[������]");
		
		for(i=2;i<=9;i++) {
			System.out.print(i+"��> ");
			for(j=1;j<=9;j++) System.out.print(i+"*"+j+"="+i*j+"  ");
			System.out.println();
		}
		
		
		System.out.println();
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		// �� ���̾Ƹ�� ��		
		System.out.println("\n\n�� ���̾Ƹ�� ��\n");
		
		for(i=0;i<10;i++) {
			for(j=10;j>i;j--) System.out.print("��");
			for(j=0;j<=i;j++) System.out.print("��");
			for(j=0;j<=i;j++) System.out.print("��");
			for(j=10;j>i;j--) System.out.print("��");
			System.out.println();
		}

		for(i=1;i<10;i++) {
			for(j=0;j<=i;j++) System.out.print("��");
			for(j=10;j>i;j--) System.out.print("��");
			for(j=10;j>i;j--) System.out.print("��");
			for(j=0;j<=i;j++) System.out.print("��");
			System.out.println();
		}
		
		
		// ���� ��� �����ϱ�
		System.out.println("\n\n[���� ��� ���� (n*n���� @���)]");
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(i==j) System.out.print("@");
				else System.out.print("#");
			}
			System.out.println();
		}

		
		// ���� ��� �����ϱ�
		System.out.println("\n\n[���� ��� ���� (���� �ϳ��� �о� ���)]");
		
		for(i=1;i<=5;i++) {
			for(j=i;j<i+5;j++) System.out.print(j);
			System.out.println();
		}
		

		// �� �ٶ����� ��		
		System.out.println("\n\n�� �ٶ����� ��\n");
		
		for(i=0;i<10;i++) {
			for(j=0;j<=i;j++) System.out.print("��");
			for(j=9;j>i;j--) System.out.print("��");
			for(j=10;j>i;j--) System.out.print("��");
			for(j=1;j<=i;j++) System.out.print("��");
			System.out.println();
		}

		for(i=0;i<10;i++) {
			for(j=9;j>i;j--) System.out.print("��");
			for(j=0;j<=i;j++) System.out.print("��");
			for(j=1;j<=i;j++) System.out.print("��");
			for(j=10;j>i;j--) System.out.print("��");
			System.out.println();
		}
		
		System.out.println();

	}
}
