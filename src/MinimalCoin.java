import java.util.Scanner;

/* 10��, 100��, 500�� ¥���� ������ ������ �ִ�.
 * �̶� �ݾ��� �־����� �ּ����� ������ �̿��ؼ� �ݾ��� ���纸��.
 * 500�� � �̷�������*/
public class MinimalCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ݾ��� �Է��ϼ�����(1�� �ڸ� ������ ������ �Է����� ������;) : ");
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
		System.out.println(c+"�� : " + num);
		return count;
	}
	
	public static int BCount(int b, int count) {
		int num=0;
		while(count-b>=0) {
			count=count-b;
			num++;
		}
		System.out.println(b+"�� : " + num);
		return count;
	}
	public static int ACount(int a, int count) {
		int num=0;
		while(count-a>=0) {
			count=count-a;
			num++;
		}
		System.out.println(a+"�� : " + num);
		return count;
	}
}
