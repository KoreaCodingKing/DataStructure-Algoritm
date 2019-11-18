package Test;

import java.util.*;
public class JosephusProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("길이를 입력하세요");
		int leng=sc.nextInt();
		
		System.out.println("배수를 입력하세요");
		int target=sc.nextInt();
		
		Josephus(leng, target);
	}

	private static void Josephus(int leng, int target) {
		int[] list=new int[leng];
		int[] resultList=new int[leng];
		
		for(int i=0;i<leng;i++) list[i]=i+1;
		
		int listSize=leng;
		int resultListSize=0;
		int location=1;
		
		while(resultListSize<leng) {
			int pickCount=0;
			int currentlistSize=0;
			for(int i=0;i<leng;i++) {
				if((location%target)==0) {
					resultList[resultListSize++]=list[i];
					pickCount++;
				}else {
					list[currentlistSize++]=list[i];
				}
				location++;
			}
			listSize-=pickCount;
		}
		
		for(int item:resultList) {
			System.out.print(item + " ");
		}
	}
}
