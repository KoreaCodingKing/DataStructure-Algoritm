import java.util.Scanner;

/* �����˻��� ����.(�켱 ����)
 * ���� �߰��ؾ� �Ұ�
 * ������ ������ ������.
 * �迭�� ũ��� �˻� ��� ���ڸ� �Է¹޾� ���� Ž���� �̿��ؼ� �� ������ �� ��°�� �ִ� �� Ȯ������
 * �Ǻ���ġ, 2�� ��� ���� �غ�����.
 * */

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �迭�� ũ�⸦ ���Ҳ���");
		int length = sc.nextInt();
		
		//�迭 �ʱ�ȭ
		int[] arr = new int[length];
		
		//�迭�� ���ֱ� 2�ǹ��
		for(int i=0;i<arr.length;i++) {
			arr[i] = i*2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("ã������ ���ڸ� �Է��ϼ���");
		int target = sc.nextInt();
		
		int top = arr.length-1;//top�� ��ġ �ʱ� ����
		int bottom = 0;//bottom�� ��ġ �ʱ� ����

		int count = 0; // ��ȸ���ϴ��� Ȯ���Ѵ�.
		
		//while���� �̿��켭 �ݺ���Ų��.
		while(true) {
			int middle = (top-bottom)/2;//miiddle�� ��ġ ����
			count++;
				if (middle > target) {
					top = middle-1;
				}if (middle < target) {
					bottom = middle+1;
				}
				if(arr[middle]==target) {
				System.out.println("�˻��Ϸ�");
				System.out.println(count + "ȸ���߽��ϴ�.");
				break;
			}
		}
		
	}
}
