package oop1120;

public class ArrayTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayTest ]"+"\n");
		
		int arr[]=new int[3];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;

		for(int i=0;i<3;i++) arr[i]=(i+1)*10;		// �迭 ���� �ݺ���
		
		for(int i=0;i<3;i++) {		// �迭 �� ��� �ݺ���
			System.out.println("["+i+"] = "+arr[i]);
		}
		System.out.println("�迭�� ����: "+arr.length);
		
		
		System.out.println();
		
		int arr1[]= {1,2,3};
		int size=arr1.length;
		
		for(int i=0;i<size;i++) System.out.println(arr[i]);
		
		
		
	}
}
