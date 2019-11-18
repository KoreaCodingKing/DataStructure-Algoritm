package Test;

import java.util.*;

public class SW8673 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("참가 인원수를 입력하세요.");
		int participate=sc.nextInt();
		
		/* 참가자 능력치 입력 */
		int[] gamer=new int[participate];
		/* 각 대회별 능력치(지루함) 차이 저장 */
		int[] gapLevel=new int[participate-1];
		
		for(int i=0;i<participate;i++) {
			System.out.println("각 출전자의 능력치를 순서대로 입력하세요.");
			gamer[i]=sc.nextInt();
		}
		
		System.out.println("출전자 능력치 입력이 완료 됐습니다. 곧 토너먼트가 시작됩니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("토너먼트가 시작되었습니다.");
		
		System.out.println("선수명단 확인");
		System.out.print(Arrays.toString(gamer) + " ");
		System.out.println();
		
		int currentGapLevel=0;
		
		while (participate >= 1) {
			int updateParticipate = 0;

			if (participate > 2) {
				for (int i = 0; i <= participate / 2 + 2; i += 2) {
					if (gamer[i] >= gamer[i + 1]) {
						gapLevel[currentGapLevel] = gamer[i] - gamer[i + 1];
						System.out.print("i우승 : " + gamer[i] + " ");
						gamer[updateParticipate] = gamer[i];
						updateParticipate++;
					} else if (gamer[i] < gamer[i + 1]) {
						gapLevel[currentGapLevel] = gamer[i + 1] - gamer[i];
						System.out.print("k우승 : " + gamer[i + 1] + " ");
						gamer[updateParticipate] = gamer[i + 1];
						updateParticipate++;
					}
					currentGapLevel++;
				}
			} else {
				System.out.println("최종 우승 : " + gamer[gamer.length - 2]);
			}

			participate /= 2;
		}
		
		int totalGapLevel=0;
		for(int i=0;i<gapLevel.length;i++) {
			System.out.print(gapLevel[i] + " ");
			totalGapLevel+=gapLevel[i];
		}
		System.out.println(totalGapLevel);
	}
}
