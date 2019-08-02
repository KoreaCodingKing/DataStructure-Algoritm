
public class InsertSort {
	public static void main(String[] args) {
		int[] arr= {2,7,8,9,0,5,1,4,3,6};
		
		int size=arr.length-1;
		
		for(int i=1;i<size;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
}
