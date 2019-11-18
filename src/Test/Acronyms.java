package Test;

import java.util.*;

public class Acronyms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대상 문자열을 입력하세요");
		String target=sc.nextLine();
		
		acronym(target);
	}
	
	public static void acronym(String target) {	
		String result="";
		
		for(int i=0; i<target.length()-1;i++) {
			int change=0;

			if(i==0) {
				change=(int)target.charAt(0)-32;
				result+=Character.toString((char)change);
			}
			if(target.charAt(i)==' ') {
				change=(int)target.charAt(i+1)-32;
				result+=Character.toString((char)change);
			}
		}
		System.out.println("약어는 " + result);
	}
}
