import java.util.Random;

/*�迭�� ���� �� ���������� �̿��ؼ� ������������ ��������*/
public class BubbleSort {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];//�迭 ����
		System.out.println("ó�� �迭 : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		
		Sort(arr);
	}//main
	
	private static void Sort(int[] arr) {
		for(int j=0;j<9;j++) {
			System.out.println();
			System.out.println((j+1) + "��° ����");
			for(int k=0;k<9;k++) {
				//���� �迭��ġ�� ���ؼ� ������
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}//k for
			for(int h=0;h<arr.length;h++) {
				System.out.print(arr[h] + " ");
			}
		}// j for
	}//sort
}//class
