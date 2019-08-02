import java.util.ArrayList;
import java.util.Scanner;

/* Decque�� ��������
 * ���� insertFront(), deleteFront() ������ Front �� top���� �������� �� ������ push(), pop() ����� ����,
insertRear(), deleteRear() ������ rear�� ������ top���� �������� �� ������ push(), pop() ����� ����.
�׸��� ���� insertRear(), deleteFront() ������ �Ϲ� ť�� enQueue(), deQueue() ����� ����. 
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
		System.out.println("���ٰ� �����ϰ� �ͳ�(�����Է�) : 1. Front��, 2. Rear�� ");
		int i=sc.nextInt();
		if(i==1)
			list = front.selFInsert(list, item);
		else
			list = rear.selRInsert(list, item);
	}
	
	public void selDelete() {
		System.out.println("��� �����ϰ� �ͳ�(�����Է�) : 1. Front��, 2. Rear��");
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
		System.out.println(i + "�� ���������ϴ�.");
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
		System.out.println(i + "�� ���������ϴ�.");
		list.remove(list.size()-1);
		return list;
	}
}

public class MakeDeque {
	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arr<T> arr = new Arr<T>();

		System.out.println("/insert = �����մϴ�.(push)");
		System.out.println("/delete = �����ϴ�.(pop)");
		System.out.println("/show = ���� �迭�� ���¸� �����ݴϴ�.");
		System.out.println("/exit = ���α׷��� �����մϴ�.");
		while(true) {
			System.out.println("�۾��ϰ� ���� ���� ������");
			String sel = sc.next();
			
			if(sel.equals("/insert")) {
				System.out.println("�����ϰ� ���� ���ڳ� ���ڸ� �Է��ϼ���");
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
