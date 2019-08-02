import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* 숫자야구 게임
 * 세자리 숫자 랜덤값을 받아 사용자가 풀도록 하자
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
				System.out.println(sCount + "스트라이크" + bCount + "볼!!");
			}else if(sCount==3) {
				System.out.println("승리!!!! 정답공개!!");
				System.out.println(arr);
				System.out.println("게임을 끝냅니다.");
				break;
			}
		}
	}//while
	
	public static ArrayList<Integer> CreatNum(ArrayList<Integer> arr) {
		//랜덤 세자리수 배열을 만든다
		System.out.println("랜덤숫자 생성");
		for(int i=0;i<3;i++) {
			arr.add(rd.nextInt(10));
		}
		System.out.println("랜덤숫자 생성 완료");
		
		return arr;
	}
	
	public static ArrayList<Integer> User(ArrayList<Integer> arr1) {
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + " 번째 자리 숫자를 입력하세요");
			arr1.add(sc.nextInt());
		}
		return arr1;
	}
}
