import java.util.Scanner;

/* �Է°� ��ŭ�� �Ǻ���ġ ������ �������! */
// �Է� �� �ޱ�
// ���ȣ���� �̿��� ���簪 n �̶� ġ�� n-2 + n-1�� ��� 
// �Է°����� ũ�ų� ������ ���α׷� ���� �� ���

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�� ��°���� ���?");
		int sel = sc.nextInt();
		
		int i=0;
		System.out.print(i + " ");//�ʱⰪ ���
		
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
