package Test;

import java.util.*;
public class SW1210 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int test_case=sc.nextInt();
		int[][] gameTable=new int[10][10];
		int start=0;	// ���� ��ġ
		int result=0;	// ��� ��ġ(2)�� ������ ������ġ ����
		
		/* ��ٸ� ��Ʈ ���� */
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				gameTable[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<10;i++) {
			/* gameTable[line][start] �̷��� �������� */
			int line=0;
			
			if (gameTable[line][start] == 1) {
				line++;
				while (true) {
					/* ù�κа� ������ �κ��� ���� ����, ���� Ȯ���ʿ������ �и����ش�. */
					if (start > 0 && start < 9) {
						/* �翷�� ��� 0�϶� �׳� ������ */
						if(gameTable[line][start+1]==0 && gameTable[line][start-1]==0) {
							line++;
						}
						
						/* �������� +1, ������ +1 ���� 0�ϰ�� ������ */
						if(gameTable[line][start+1]==1 && gameTable[line+1][start+1]==0) {
							start++;
						/* ������ +1 ���� 1�ϰ�� ��ĭ �Ʒ��� */
						}else if(gameTable[line][start+1]==1 && gameTable[line+1][start+1]==1) {
							start++;
							line++;
						}
						
						/* ���� �ݴ�*/
						if(gameTable[line][start-1]==1 && gameTable[line+1][start-1]==0) {
							start--;
						}else if(gameTable[line][start-1]==1 && gameTable[line+1][start-1]==1) {
							start--;
							line++;
						}
					} else if (start == 0) {
						/* ù ��° ���ο� ���Խ� */
						if(gameTable[line][start+1]==1) {
							start++;
						}else if(gameTable[line][start+1]==0) {
							line++;
						}
					} else if (start == 9) {
						/* ������ ���ο� ���Խ� */
						if(gameTable[line][start-1]==1) {
							start--;
						}else if(gameTable[line][start-1]==0) {
							line++;
						}
					}
					System.out.println();
					/* ������ġ�� 2�ϰ�� result�� �������� break */
					if(line==9 && gameTable[line][start]==2) {
						System.out.print(line + " ");
						System.out.print(start);
						result=i;
						break;
					}else {
						System.out.print(line + " ");
						System.out.print(start);
						start++;
						break;
					}
				}//while
			}else if(gameTable[line][start] == 0) {
				start++;	// ���� ��ġ�� 1���ؼ� ���� ������ġ�� �ű��.
			}
		}// for
		
		System.out.println("#"+test_case + " " + result);
	}
}
