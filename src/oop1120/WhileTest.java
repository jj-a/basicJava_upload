package oop1120;

public class WhileTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - WhileTest ]"+"\n");
		
		
		int i=3;
		while(i<=5) {
			System.out.println("java");
			i++;
		}
		
		i=3;
		do {
			System.out.println("jsp");
			i++;
		}while(i<=5);
		
		System.out.println();
		
		i=0;
		while(true) {
			System.out.print(i);
			i++;
			if(i==10) break;
		}
		
		
		// lab1. 1~1000���� ���� ��
		System.out.println("\n\n[lab1] 1~1000 ���� ��");
		
		int sum=0;
		i=1;
		
		while(i<=1000) {
			sum+=i;
			if(sum>10000){
				System.out.println("1~"+i+"���� ���� = "+sum); 
				break;
			}
			i++;
		}
		
		//lab2. 1~1000�� 3�� ����� ���� ��
		System.out.println("\n\n[lab2] 1~1000�� 3�� ����� ���� ��");
		
		sum=0;
		i=1;
		
		while(true) {
			if(i%3==0){
				sum+=i;
				System.out.print("+"+i);
			}
			if(sum>1000) break;
			i++;
		}
		System.out.println("="+sum); 
		
		
		
	}
}
