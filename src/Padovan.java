import java.util.LinkedList;
import java.util.Scanner;

/*파도반 수열을 구현하자
 * 수열 : 1 1 1 2 2 3 4 5 7 9.....
 * pn = pn-2 + pn-3*/
public class Padovan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.print("몇회전 할꺼임? : ");
		int lot = sc.nextInt();
	
		for (int i = 0; i < lot; i++) {
			System.out.print(Pado(i) + " ");
		}
	}
	
	public static int Pado(int i) {
		int count = (i-2)+(i-3);
		if(count<0)
			return 1;
		else
			return Pado(i-2)+Pado(i-3);
	}
}
