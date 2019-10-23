package Test;

import java.util.Scanner;

public class Baekjun1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int course=sc.nextInt();
		
		double[] darr=new double[course];
		
		for(int i=0;i<course;i++) {
			int score=sc.nextInt();
			darr[i]=score;
		}
		

		double bScore=0;
		
		for(int i=0;i<course-1;i++) {
			if(darr[i]<darr[i+1]) {
				bScore=darr[i+1];
			}else if(darr[i]>darr[i+1]) {
				bScore=darr[i];
			}else if(darr[i]==darr[i+1]){
				bScore=darr[i];
			}
		}
		
		double sChange=0;
		
		for(int i=0;i<course;i++) {
			sChange=(darr[i]/bScore)*100;
			darr[i]=sChange;
		}
		
		double count=0;
		for(int i=0;i<course;i++) {
			count += darr[i];
		}
		
		double result=0;
		result=count/darr.length;
		
		System.out.println(result);
	}
}
