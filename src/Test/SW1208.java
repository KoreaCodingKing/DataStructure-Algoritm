package Test;

import java.util.*;
/* 박스들이 너무 난잡하게 쌓여있어 평탄화 작업을 하려한다. 옮기는 횟수가 주어질 때
 * 가장 높은 박스와 가장 낮은 박스를 평탄화하여 그 차를 구하세요 */
public class SW1208 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int test_case=10;
		
		for(int i=0; i<test_case;i++) {
			int dump=sc.nextInt();
			int[] boxes=new int[100];
			int maxHeight=0;
			int maxLocation=0;
			int minHeight=0;
			int minLocation=0;
			
			for(int j=0;j<boxes.length;j++) {
				boxes[i]=sc.nextInt();
			}
			/* 입력 끝 */
			
			/* 박스를 옮기는 횟수만큼 반복 */
			for(int j=0;j<dump;j++) {				
				/* 가장 높은 박스의 높이와 가장 낮은 박스의 높이 구하기 */
				for(int k=0;k<boxes.length-1;k++) {
					if(boxes[k]>boxes[k+1]) {
						maxHeight=boxes[k];
						maxLocation=k;
					}else if(boxes[k]<boxes[k+1]) {
						minHeight=boxes[k];
						minLocation=k;
					}
				}
				
				/* 가장 높은 박스와 낮은 박스 평탄화 */
				boxes[maxLocation]=maxHeight-1;
				boxes[minLocation]=minHeight+1;
			}
			
			for(int k=0;k<boxes.length-1;k++) {
				if(boxes[k]>boxes[k+1]) {
					maxHeight=boxes[k];
				}else if(boxes[k]<boxes[k+1]) {
					minHeight=boxes[k];
				}
			}
			
			System.out.println("#" + test_case + " " + (maxHeight-minHeight));
		}
	}
}
