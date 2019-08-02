import java.util.Scanner;

public class CircularQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rear=0;
		int front=0;
		int size=5;	//배열의 크기
		
		Integer[] list = new Integer[size];
		
		while(true) {
			System.out.println("원하는 작업을 선택하세요(/pop : 값 꺼내기, /push : 값 넣기, /exit : 종료, /all 전체리스트 확인하기)");
			String sel = sc.next();
			
			if (sel.equals("/pop")) {
				System.out.println("꺼내진 값 : " + list[front+1]);
				for(int i=0;i<size-1;i++) {
					list[i]=list[i+1];
				}
				front+=1;
				if(front==size-1) {
					System.out.println("더이상 값을 넣읋 수 없으니 /pop을 실행해ㅠㅠ push하면 난 몰라;");
				}
			}else if(sel.equals("/push")){
				System.out.println("원하는 값을 입력하세요");
				int item=sc.nextInt();
				
				if((rear+1)%size==front) {
					System.out.println("꽉차서 강제로 꺼냄 : " + list[front+1]);
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
