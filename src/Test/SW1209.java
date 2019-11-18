package Test;

import java.util.*;
/* 2차원 배열이 주어질때 가로의 총함 대각선들의 총합을 구하여 가장 큰 수를 구하여라 */
public class SW1209 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int[][] arr=new int[5][5];
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
			int horizonadd=0;
			int verticaladd=0;
			int diagonaladd=0;
			
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					arr[j][k]=sc.nextInt();
				}
			}
			
			/* 가로 세로 대각선의 합 계산 */
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					horizonadd+=arr[j][k];
					verticaladd+=arr[k][j];
					
					if(j==k) diagonaladd+=arr[j][k];
				}
				pq.add(horizonadd);
				pq.add(verticaladd);
			}
			pq.add(diagonaladd);
			
			/* /구하기 */
			int reversediagonaladd=0;
			for(int j=0;j<arr.length;j++) {
				reversediagonaladd+=arr[j][arr.length-j-1];
			}
			pq.add(reversediagonaladd);
			
			System.out.println("#" + (i+1) + " " + pq.poll());
		}
	}
}
