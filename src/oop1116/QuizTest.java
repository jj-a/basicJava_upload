package oop1116;

public class QuizTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - QuizTest ]"+"\n");
		
		// homework. ����Ÿ��� ���� �ý� ����� ����ϴ� ���α׷�
		// ~2000m �⺻��� 900�� / 2000m�ʰ� 200m�������� �⺻���+100�� ����
		// ��°��> ����Ÿ�: 3000  ���: ?
		System.out.println("[homework/11.16] ����Ÿ��� ���� �ý� ��� ���");
		
		int m=3000;
		int fare=0;
		
		if(m<=2000) fare=900;
		else if(m>2000) fare=900+(m-2000)/200*100;
		
		System.out.println("����Ÿ�: "+m+"m");
		System.out.println("���: "+fare+"��");
		
		
	}
}
