package Test;

import java.util.*;
/* 학생들의 점수들이 주어지면 각 학생들의 점수들 중 가장 많은 점수를 구하시오 */
public class SW1204 {
	public static void main(String[] args) {
		Random rd=new Random();
		System.out.println("학생들의 점수를 입력하고 있습니다...");
		int[] scores=new int[1000];
		for(int i=0; i<scores.length;i++) {
			scores[i]=rd.nextInt(100);
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		int[] countScore=new int[101];
		for(int i=0;i<scores.length;i++) {
			countScore[scores[i]]+=1;
		}
		
		System.out.println(Arrays.toString(countScore) + " ");
		int manyScore=0;	// 많이 맞은 스코어의 개수 저장
		int score=0;		// 많이 맞은 스코어 저장
		for(int i=0;i<countScore.length;i++) {
			if(countScore[i]>=manyScore) {
				manyScore=countScore[i];
				score=i;
			}
		}
		
		System.out.println("가장 많이 받은 점수는 " + score + ", 개수는 " + manyScore);
	}
}
