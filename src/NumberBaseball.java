import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* ���ھ߱� ����
 * ���ڸ� ���� �������� �޾� ����ڰ� Ǯ���� ����
 */
public class NumberBaseball {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr = CreatNum(arr);
	
		while(true){
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			
			arr1 = User(arr1);
			int sCount=0;
			int bCount=0;
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j && arr.get(i)==arr1.get(j)) {
						sCount++;
					}else if(i!=j && arr.get(i)==arr.get(j)) {
						bCount++;
					}
				}//for2
			}//for1
			if(sCount!=3) {
				System.out.println(sCount + "��Ʈ����ũ" + bCount + "��!!");
			}else if(sCount==3) {
				System.out.println("�¸�!!!! �������!!");
				System.out.println(arr);
				System.out.println("������ �����ϴ�.");
				break;
			}
		}
	}//while
	
	public static ArrayList<Integer> CreatNum(ArrayList<Integer> arr) {
		//���� ���ڸ��� �迭�� �����
		System.out.println("�������� ����");
		for(int i=0;i<3;i++) {
			arr.add(rd.nextInt(10));
		}
		System.out.println("�������� ���� �Ϸ�");
		
		return arr;
	}
	
	public static ArrayList<Integer> User(ArrayList<Integer> arr1) {
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + " ��° �ڸ� ���ڸ� �Է��ϼ���");
			arr1.add(sc.nextInt());
		}
		return arr1;
	}
}
