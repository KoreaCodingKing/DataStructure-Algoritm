import java.util.LinkedList;
import java.util.Scanner;

/*���ñ����� ��������
 * push X: ���� X�� ���ÿ� �ִ� �����̴�.
   pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   size: �迭�� ũ�⸦ �ø��ų� �ٿ��ش�.
   empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
   top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
*/
class List<T>{
	LinkedList<T> arr=new LinkedList<T>();
	T item;
	
	List() {

	}

	public void push(T item) {
		this.item=item;
		arr.add(item);
	}
	
	public void pop() {
		System.out.println(arr.get(arr.size()-1));
		arr.removeLast();
	}
}
public class MakeStack {

	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<T> list =new List<T>();
		
		System.out.println("��ɾ� �Է� �� �迭�� �߰��� ������ �Է��ϼ���");
		System.out.println("���� �����ϰ� ������ /push, ���� ������ ����ϰ� ������ /pop");
		System.out.println("�����ϰ� ������ /exit ��������~~~~~~");
		while(true) {
			String sel = sc.next();
			if(sel.equals("/push")) {
				System.out.println("������ ���� �Է��ϼ���");
				T item = (T) sc.next();
				list.push(item);
			}else if(sel.equals("/pop")) {
				list.pop();
			}else if(sel.equals("/exit")) {
				break;
			}
		}//while
	}//main
}//publicclass
