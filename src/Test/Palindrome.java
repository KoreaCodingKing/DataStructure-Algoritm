package Test;

/* 앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
	문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.
	예를들면, 문자열 s가 abcdcba이면 7을 return하고 abacde이면 3을 return합니다.
*/
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String s="abacde";
		
		int answer=0;
		
		for(int i=0;i<s.length();i++) {
			
			while(true) {
				int endpoint=s.length()-1;
				if(s.substring(i)==s.substring(endpoint)) {
					answer=endpoint-i+1;
					break;
				}else {
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
