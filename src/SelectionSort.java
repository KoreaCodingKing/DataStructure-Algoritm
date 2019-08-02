import java.util.Random;

/* 선택정렬을 통한 배열 정리를 해보자*/
public class SelectionSort {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];
		
		System.out.print("최초의 배열 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(10)+1;
			System.out.print(arr[i] + " ");
		}
	
		SelecSort(arr);
	}
	
	public static void SelecSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) { 
			int min=i;
			System.out.println();
			System.out.println((i+1) + "번째 회전");
			
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[min]>arr[j])
					min=j;
			}//for j
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]=temp;
			
			for(int h=0;h<arr.length;h++) {
				System.out.print(arr[h] + " ");
			}//for h 
		}//for i
	}//pulicselectsort
}//class
