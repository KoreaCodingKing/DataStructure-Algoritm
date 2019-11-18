package Test;

import java.util.*;
public class SW1210 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int test_case=sc.nextInt();
		int[][] gameTable=new int[10][10];
		int start=0;	// 시작 위치
		int result=0;	// 결과 위치(2)가 나오면 시작위치 저장
		
		/* 사다리 루트 설정 */
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				gameTable[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<10;i++) {
			/* gameTable[line][start] 이렇게 생각하자 */
			int line=0;
			
			if (gameTable[line][start] == 1) {
				line++;
				while (true) {
					/* 첫부분과 마지막 부분은 각각 우측, 좌측 확인필요없으니 분리해준다. */
					if (start > 0 && start < 9) {
						/* 양옆이 모두 0일때 그냥 내려감 */
						if(gameTable[line][start+1]==0 && gameTable[line][start-1]==0) {
							line++;
						}
						
						/* 오른쪽은 +1, 오른쪽 +1 밑이 0일경우 옆으로 */
						if(gameTable[line][start+1]==1 && gameTable[line+1][start+1]==0) {
							start++;
						/* 오른쪽 +1 밑이 1일경우 한칸 아래로 */
						}else if(gameTable[line][start+1]==1 && gameTable[line+1][start+1]==1) {
							start++;
							line++;
						}
						
						/* 위와 반대*/
						if(gameTable[line][start-1]==1 && gameTable[line+1][start-1]==0) {
							start--;
						}else if(gameTable[line][start-1]==1 && gameTable[line+1][start-1]==1) {
							start--;
							line++;
						}
					} else if (start == 0) {
						/* 첫 번째 라인에 진입시 */
						if(gameTable[line][start+1]==1) {
							start++;
						}else if(gameTable[line][start+1]==0) {
							line++;
						}
					} else if (start == 9) {
						/* 마지막 라인에 진입시 */
						if(gameTable[line][start-1]==1) {
							start--;
						}else if(gameTable[line][start-1]==0) {
							line++;
						}
					}
					System.out.println();
					/* 최종위치가 2일경우 result에 저장한후 break */
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
				start++;	// 시작 위치를 1더해서 다음 시작위치로 옮긴다.
			}
		}// for
		
		System.out.println("#"+test_case + " " + result);
	}
}
