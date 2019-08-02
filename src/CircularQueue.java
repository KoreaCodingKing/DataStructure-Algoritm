import java.util.Scanner;

public class CircularQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rear=0;
		int front=0;
		int size=5;	//�迭�� ũ��
		
		Integer[] list = new Integer[size];
		
		while(true) {
			System.out.println("���ϴ� �۾��� �����ϼ���(/pop : �� ������, /push : �� �ֱ�, /exit : ����, /all ��ü����Ʈ Ȯ���ϱ�)");
			String sel = sc.next();
			
			if (sel.equals("/pop")) {
				System.out.println("������ �� : " + list[front+1]);
				for(int i=0;i<size-1;i++) {
					list[i]=list[i+1];
				}
				front+=1;
				if(front==size-1) {
					System.out.println("���̻� ���� �֟� �� ������ /pop�� �����ؤФ� push�ϸ� �� ����;");
				}
			}else if(sel.equals("/push")){
				System.out.println("���ϴ� ���� �Է��ϼ���");
				int item=sc.nextInt();
				
				if((rear+1)%size==front) {
					System.out.println("������ ������ ���� : " + list[front+1]);
					for(int i=0;i<size-1;i++) {
						list[i]=list[i+1];
						rear=0;
					}
				}
				
				list[rear+1]=item;
				rear++;
			}else if(sel.equals("/exit")) {
				break;
			}else if(sel.equals("/all")) {
				for(int i=0;i<size;i++) {
					System.out.print(list[i]+" ");
				}
			}
		}//while
	}
}
