package Test;

import java.util.*;
/* 2���� �迭�� �־����� ������ ���� �밢������ ������ ���Ͽ� ���� ū ���� ���Ͽ��� */
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
			
			/* ���� ���� �밢���� �� ��� */
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
			
			/* /���ϱ� */
			int reversediagonaladd=0;
			for(int j=0;j<arr.length;j++) {
				reversediagonaladd+=arr[j][arr.length-j-1];
			}
			pq.add(reversediagonaladd);
			
			System.out.println("#" + (i+1) + " " + pq.poll());
		}
	}
}
