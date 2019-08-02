import java.util.Scanner;

/* 두 정수 AB를 입력 받은 후 +* / -을 계산하세요 
 * class 이용 호출 */
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
		System.out.println("어떤 연산을 하시겠습니까?");
		char cal=sc.next().charAt(0);
		
		if(cal=='+') {
			System.out.println(a + "+" + b + "= " + (a+b));
		}else if(cal=='-') {
			System.out.println(a + "-" + b + "= " + (a-b));
		}else if(cal=='*') {
			System.out.println(a + "*" + b + "= " + (a*b));
		}else if(cal=='/') {
			if (a==0||b==0) {
				System.out.println("0은 나눌 수가 없습니다. 다시 입력하세요.");
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
		System.out.println("첫 번째 정수를 입력하세요");
		a = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
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
			System.out.println("계속 하시겠습니까? y/n");
			char sel = sc.next().charAt(0);
			if(sel=='n' || sel=='N') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.exit(0);
	}
}
