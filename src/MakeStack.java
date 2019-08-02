import java.util.LinkedList;
import java.util.Scanner;

/*스택구조를 구현하자
 * push X: 정수 X를 스택에 넣는 연산이다.
   pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   size: 배열의 크기를 늘리거나 줄여준다.
   empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
   top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
		
		System.out.println("명령어 입력 후 배열에 추가할 값들을 입력하세요");
		System.out.println("값을 저장하고 싶으면 /push, 값을 꺼내고 출력하고 싶으면 /pop");
		System.out.println("종료하고 싶으면 /exit 누르세용~~~~~~");
		while(true) {
			String sel = sc.next();
			if(sel.equals("/push")) {
				System.out.println("저장할 값을 입력하세요");
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
