package Test;

/*
 �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
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
