package Test;

import java.util.*;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* depth�� ����� ���� ���� �ǹ�. */
		System.out.println("���ٱ��� ���?");
		int depth=sc.nextInt();
		
		TriangleCount(depth);
	}

	private static void TriangleCount(int depth) {
		long startTime, finishTime;
		
		/* ����Լ��� �̿��� �Ľ�Į�� �ﰢ�� ��°� �ð� ��� */
		startTime=System.currentTimeMillis();
		RecrusivePascalTriangle(depth);
		finishTime=System.currentTimeMillis();
		System.out.println("����Լ��� �̿��� �ð� : " + (finishTime-startTime));
		
		/* ������ �迭�� �̿��� �Ľ�Į�� �ﰢ�� ��°� �ð� ��� */
		startTime=System.currentTimeMillis();
		ArrayPascalTriangle(depth);
		finishTime=System.currentTimeMillis();
		System.out.println("Array�� �̿��� �ð� : " + (finishTime-startTime));
		
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
