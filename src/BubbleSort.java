import java.util.Random;

/*배열을 저장 후 버블정렬을 이용해서 오름차순으로 정렬하자*/
public class BubbleSort {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];//배열 선언
		System.out.println("처음 배열 : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		
		Sort(arr);
	}//main
	
	private static void Sort(int[] arr) {
		for(int j=0;j<9;j++) {
			System.out.println();
			System.out.println((j+1) + "번째 정렬");
			for(int k=0;k<9;k++) {
				//다음 배열위치와 비교해서 작으면
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
