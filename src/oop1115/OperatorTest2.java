package oop1115;

public class OperatorTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OperatorTest2 ]"+"\n");
		
		
		// lab1. ���� ��� ���ϱ�
		// ��°��> ���� 5�� õ�� 6�� ...
		System.out.println("[lab1] ���� ��� ���ϱ� (56430��)");
		
		int money=56430;
		//int cng=money;
		double cnt4=money*0.0001;
		double cnt3=money%10000*0.001;
		double cnt2=money%1000*0.01;
		double cnt1=money%100*0.1;

		
		System.out.println("���� "+(int)cnt4+"��");
		System.out.println("õ�� "+(int)cnt3+"��");
		System.out.println("��� "+(int)cnt2+"��");
		System.out.println("�ʿ� "+(int)cnt1+"��");
		
		
		System.out.println();
		
		// lab2. 365.2422(...)��
		// ��°��> 365�� ?�ð� ?�� ?��
		System.out.println("[lab2] 1�� ����ϱ� (365.2422��)");
		
		double oneyear=365.2422; 
		
		double day=oneyear;
		double hour=oneyear%(int)oneyear*24;
		double min=hour%(int)hour*60;
		double sec=min%(int)min*60;
		
		System.out.print((int)day+"�� ");
		System.out.print((int)hour+"�ð� ");
		System.out.print((int)min+"�� ");
		System.out.println((int)sec+"��");
		
		System.out.println("�˻� = "+day+(hour+(min+sec*60)*60)*24);
		
	}
}
