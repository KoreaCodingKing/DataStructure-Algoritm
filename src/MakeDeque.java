import java.util.ArrayList;
import java.util.Scanner;

/* Decque을 구현하자
 * 덱의 insertFront(), deleteFront() 연산은 Front 를 top으로 생각했을 때 스택의 push(), pop() 연산과 같고,
insertRear(), deleteRear() 연산은 rear를 스택의 top으로 생각했을 때 스택의 push(), pop() 연산과 같다.
그리고 덱의 insertRear(), deleteFront() 연산은 일반 큐의 enQueue(), deQueue() 연산과 같다. 
*/
class Arr<T>{
	T item;
	ArrayList<T> list = new ArrayList<T>();
	Scanner sc=new Scanner(System.in);
	Front<T> front = new Front<T>();
	Rear<T> rear = new Rear<T>();
	
	Arr(){
	}
	
	public T getitem(T item) {
		return this.item=item;
	}
	
	public void selInsert() {
		System.out.println("어디다가 삽입하고 싶냐(숫자입력) : 1. Front단, 2. Rear단 ");
		int i=sc.nextInt();
		if(i==1)
			list = front.selFInsert(list, item);
		else
			list = rear.selRInsert(list, item);
	}
	
	public void selDelete() {
		System.out.println("어디 삭제하고 싶냐(숫자입력) : 1. Front단, 2. Rear단");
		int i=sc.nextInt();
		if(i==1)
			list = front.selFDelete(list);
		else
			list = rear.selRDelete(list);
	}
	
	public void showArr() {
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + " ");
	}
}

class Front<T>{
	public ArrayList<T> selFInsert(ArrayList<T> list, T item) {
		list.add(0, item);
		return list;
	}

	public ArrayList<T> selFDelete(ArrayList<T> list) {
		T i = list.get(0);
		System.out.println(i + "가 꺼내졌습니다.");
		list.remove(0);
		return list;
	}
	
}

class Rear<T>{
	public ArrayList<T> selRInsert(ArrayList<T> list, T item) {
		list.add(item);
		return list;
	}	 

	public ArrayList<T> selRDelete(ArrayList<T> list) {
		T i = list.get(list.size()-1);
		System.out.println(i + "가 꺼내졌습니다.");
		list.remove(list.size()-1);
		return list;
	}
}

public class MakeDeque {
	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arr<T> arr = new Arr<T>();

		System.out.println("/insert = 삽입합니다.(push)");
		System.out.println("/delete = 꺼냅니다.(pop)");
		System.out.println("/show = 현재 배열의 상태를 보여줍니다.");
		System.out.println("/exit = 프로그램을 종료합니다.");
		while(true) {
			System.out.println("작업하고 싶은 것을 고르세요");
			String sel = sc.next();
			
			if(sel.equals("/insert")) {
				System.out.println("삽입하고 싶은 숫자나 문자를 입력하세요");
				T item = (T) sc.next();
				arr.getitem(item);
				arr.selInsert();
			}else if(sel.equals("/Delete")) {
				arr.selDelete();
			}else if(sel.equals("/show")) {
				arr.showArr();
			}else if(sel.equals("/exit")) {
				break;
			}
		}
	}

}
