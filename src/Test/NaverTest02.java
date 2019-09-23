package Test;

// 구슬 탈출 문제
// # : 통과, * : 1번 통과 2번 실패, > : 왼쪽으로 한칸, < : 오른쪽으로 한칸
public class NaverTest02 {
	public static void main(String[] args) {
		String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
		
		int result=0;
		int start=0;
		
		for(;start<6;start++) {
			int j=0;
			int i=start;
			int scount=0;
			int count =0;
			
			for(;j<6;j++) {
				String str=drum[j];
				char ch = str.charAt(i);
				
				switch(ch) {
					case '#':
						count++;
						break;
					case '>':
						i++;
						count++;
						if(str.charAt(i)=='*') {
							scount++;
							if(scount==2) {
								count++;
							}
						}else if(str.charAt(i)=='>') {
							i++;
							j--;
							count--;
						}
						break;
					case '<':
						i--;
						count++;
						if(str.charAt(i)=='*') {
							scount++;
							if(scount==2) {
								count++;
							}
						}else if(str.charAt(i)=='<') {
							i--;
							j--;
							count--;
						}
						break;
					case '*':
						scount++;
						count++;
						if(scount==2) {
							count++;
						}
						break;
				}
				System.out.print("1칸 끝, ");
			}//for
			
			System.out.print(start+1 + "회차");
			
			if(count==6) {
				result+=1;
				System.out.println(" 성공");
			}else {
				System.out.println(" 실패");
			}
		}//while
		
		System.out.println("통과 구슬 갯수 : " + result);
	}
}
