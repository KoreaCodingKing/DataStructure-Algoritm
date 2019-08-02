
public class ReverseSort {
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,4,3,2,1,0};
		
		int size=arr.length;
		int last=size-1;
		int j=last;
		
		for(int i=0;i<size/2;i++) {
			int temp=arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			j--;
		
			System.out.println(arr[i] + ", ");
		}
	}//main
}
