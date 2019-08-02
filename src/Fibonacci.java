import java.util.Scanner;

/* 입력값 만큼의 피보나치 수열을 출력하자! */
// 입력 값 받기
// 재귀호출을 이용한 현재값 n 이라 치면 n-2 + n-1을 계산 
// 입력값보다 크거나 같으면 프로그램 종료 및 출력

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 번째까지 출력?");
		int sel = sc.nextInt();
		
		int i=0;
		System.out.print(i + " ");//초기값 출력
		
		for(; i<=sel;i++) {
			Fibo(i);
			System.out.print(Fibo(i) + " ");
		}
	}

	public static int Fibo(int i) {
		//F=F(n-1) + F(n-2)
		if(i<=1) 
			return 1;
		else
			return Fibo(i-1)+Fibo(i-2);
	}
}
