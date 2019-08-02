import java.util.Scanner;

/* 10원, 100원, 500원 짜리의 동전을 가지고 있다.
 * 이때 금액이 주어질때 최소한의 동전을 이용해서 금액을 맞춰보자.
 * 500원 몇개 이런식으로*/
public class MinimalCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("금액을 입력하세영ㅋ(1의 자리 동전은 없으니 입력하지 말아줘;) : ");
		int num = sc.nextInt();
		
		Count(num);
	}
	
	private static void Count(int count) {
		int a=10;
		int b=100;
		int c=500;
		
		count=CCount(c,count);
		count=BCount(b,count);
		ACount(a,count);
	}
	
	public static int CCount(int c, int count) {
		int num=0;
		while(count-c>=0) {
			count=count-c;
			num++;
		}
		System.out.println(c+"원 : " + num);
		return count;
	}
	
	public static int BCount(int b, int count) {
		int num=0;
		while(count-b>=0) {
			count=count-b;
			num++;
		}
		System.out.println(b+"원 : " + num);
		return count;
	}
	public static int ACount(int a, int count) {
		int num=0;
		while(count-a>=0) {
			count=count-a;
			num++;
		}
		System.out.println(a+"원 : " + num);
		return count;
	}
}
