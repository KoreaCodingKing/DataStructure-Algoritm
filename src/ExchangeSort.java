
public class ExchangeSort {
	public static void main(String[] args) {
		int[] arr= {2,7,8,9,0,5,1,4,3,6};
		
		int size=arr.length;
		
		for(int i=0;i<size-1;i++) {
			
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
