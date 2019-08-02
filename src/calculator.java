import java.util.Scanner;

/* �� ���� AB�� �Է� ���� �� +* / -�� ����ϼ��� 
 * class �̿� ȣ�� */
class Calc{
	int a;
	int b;
	Scanner sc;
	
	Calc(int a, int b, Scanner sc) {
		this.a=a;
		this.b=b;
		this.sc=sc;
	}
	
	void Result() {
		System.out.println("� ������ �Ͻðڽ��ϱ�?");
		char cal=sc.next().charAt(0);
		
		if(cal=='+') {
			System.out.println(a + "+" + b + "= " + (a+b));
		}else if(cal=='-') {
			System.out.println(a + "-" + b + "= " + (a-b));
		}else if(cal=='*') {
			System.out.println(a + "*" + b + "= " + (a*b));
		}else if(cal=='/') {
			if (a==0||b==0) {
				System.out.println("0�� ���� ���� �����ϴ�. �ٽ� �Է��ϼ���.");
			}else
				System.out.println(a + "/" + b + "= " + (a/b));
		}
	}
}

class Input{
	int a;
	int b;
	Scanner sc;
	
	Input(Scanner sc){
		this.sc=sc;
	}
	void setInput() {
		System.out.println("ù ��° ������ �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���");
		b = sc.nextInt();
	}
	
	int GetInputA() {
		return a;
	}
	int GetInputB() {
		return b;
	}
}

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Input in = new Input(sc);
			in.setInput();
			Calc calc = new Calc(in.GetInputA(), in.GetInputB(), sc);
			calc.Result();
			System.out.println("��� �Ͻðڽ��ϱ�? y/n");
			char sel = sc.next().charAt(0);
			if(sel=='n' || sel=='N') {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		System.exit(0);
	}
}
