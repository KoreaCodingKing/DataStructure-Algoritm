package Test;

import java.util.*;
/* �л����� �������� �־����� �� �л����� ������ �� ���� ���� ������ ���Ͻÿ� */
public class SW1204 {
	public static void main(String[] args) {
		Random rd=new Random();
		System.out.println("�л����� ������ �Է��ϰ� �ֽ��ϴ�...");
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
		int manyScore=0;	// ���� ���� ���ھ��� ���� ����
		int score=0;		// ���� ���� ���ھ� ����
		for(int i=0;i<countScore.length;i++) {
			if(countScore[i]>=manyScore) {
				manyScore=countScore[i];
				score=i;
			}
		}
		
		System.out.println("���� ���� ���� ������ " + score + ", ������ " + manyScore);
	}
}
