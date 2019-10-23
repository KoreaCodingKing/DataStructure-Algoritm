package Test;

import java.util.*;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* depth는 출력할 줄의 수를 의미. */
		System.out.println("몇줄까지 출력?");
		int depth=sc.nextInt();
		
		TriangleCount(depth);
	}

	private static void TriangleCount(int depth) {
		long startTime, finishTime;
		
		/* 재귀함수를 이용한 파스칼의 삼각형 출력과 시간 계산 */
		startTime=System.currentTimeMillis();
		RecrusivePascalTriangle(depth);
		finishTime=System.currentTimeMillis();
		System.out.println("재귀함수를 이용한 시간 : " + (finishTime-startTime));
		
		/* 이차원 배열을 이용한 파스칼의 삼각형 출력과 시간 계산 */
		startTime=System.currentTimeMillis();
		ArrayPascalTriangle(depth);
		finishTime=System.currentTimeMillis();
		System.out.println("Array를 이용한 시간 : " + (finishTime-startTime));
		
	}

	private static void ArrayPascalTriangle(int depth) {
		int[][] arr=new int[depth][];
		
		for(int i=0;i<depth;i++) {
			arr[i]=new int[i+1];
			
			for(int j=0; j<=i; j++) {
				if(j==0||i==j) arr[i][j]=1;
				else arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void RecrusivePascalTriangle(int depth) {
		for(int i=0; i<depth; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(Recrusive(i,j) + " ");
			}
			System.out.println();
		}
	}
	
	private static int Recrusive(int i, int j) {
		if(j==0 || i==j) return 1;
		return Recrusive(i-1, j-1)+Recrusive(i-1, j);		
	}
}
