package Test;

import java.util.*;
/* �ڽ����� �ʹ� �����ϰ� �׿��־� ��źȭ �۾��� �Ϸ��Ѵ�. �ű�� Ƚ���� �־��� ��
 * ���� ���� �ڽ��� ���� ���� �ڽ��� ��źȭ�Ͽ� �� ���� ���ϼ��� */
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
			/* �Է� �� */
			
			/* �ڽ��� �ű�� Ƚ����ŭ �ݺ� */
			for(int j=0;j<dump;j++) {				
				/* ���� ���� �ڽ��� ���̿� ���� ���� �ڽ��� ���� ���ϱ� */
				for(int k=0;k<boxes.length-1;k++) {
					if(boxes[k]>boxes[k+1]) {
						maxHeight=boxes[k];
						maxLocation=k;
					}else if(boxes[k]<boxes[k+1]) {
						minHeight=boxes[k];
						minLocation=k;
					}
				}
				
				/* ���� ���� �ڽ��� ���� �ڽ� ��źȭ */
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
