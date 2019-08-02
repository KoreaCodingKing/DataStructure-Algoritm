import java.util.Scanner;

/* 이진검색을 하자.(우선 과제)
 * 추후 추가해야 할것
 * 정해진 수열을 정하자.
 * 배열의 크기와 검색 대상 숫자를 입력받아 이진 탐색을 이용해서 그 수열중 몇 번째에 있는 지 확인하자
 * 피보나치, 2의 배수 등등등 해봐야지.
 * */

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마의 배열의 크기를 정할꺼냐");
		int length = sc.nextInt();
		
		//배열 초기화
		int[] arr = new int[length];
		
		//배열에 값넣기 2의배수
		for(int i=0;i<arr.length;i++) {
			arr[i] = i*2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("찾으려는 숫자를 입력하세요");
		int target = sc.nextInt();
		
		int top = arr.length-1;//top의 위치 초기 설정
		int bottom = 0;//bottom의 위치 초기 설정

		int count = 0; // 몇회전하는지 확인한다.
		
		//while문을 이용헤서 반복시킨다.
		while(true) {
			int middle = (top-bottom)/2;//miiddle의 위치 설정
			count++;
				if (middle > target) {
					top = middle-1;
				}if (middle < target) {
					bottom = middle+1;
				}
				if(arr[middle]==target) {
				System.out.println("검색완료");
				System.out.println(count + "회전했습니다.");
				break;
			}
		}
		
	}
}
