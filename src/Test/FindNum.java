package Test;

/*
 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class FindNum {
	public static void main(String[] args) {
		int[] array= {1,5,2,6,3,7,4};
		int[][] commend= {{2,5,3},{4,4,1},{1,7,3}};
		int[] check= new int[3];
		int[] temp=new int[commend.length];
		int[] result;		
		
		int cSize = commend.length;
		int cnt=0;
		
		while (true) {
			int start=0;
			int end=0;
			int find=0;
			
			for (int i = 0; i < cSize; i++) {
				check = commend[i];

				start = check[i];
				end = check[i+1];
				find = check[i+2];
			}

			for (int j = 0; j < end + 1; j++) {
				temp[j] = array[start + 1];
				start++;
			}
			
			for(int k=0;k<temp.length-1;k++) {
				for(int r=k+1;r<temp.length;r++) {
					if(temp[k]>temp[r]) {
						int index=temp[r];
						temp[r]=temp[k];
						temp[k]=index;
					}
				}
			}
		}
	}
}
