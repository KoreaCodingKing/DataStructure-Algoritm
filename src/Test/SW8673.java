package Test;

import java.util.*;

public class SW8673 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �ο����� �Է��ϼ���.");
		int participate=sc.nextInt();
		
		/* ������ �ɷ�ġ �Է� */
		int[] gamer=new int[participate];
		/* �� ��ȸ�� �ɷ�ġ(������) ���� ���� */
		int[] gapLevel=new int[participate-1];
		
		for(int i=0;i<participate;i++) {
			System.out.println("�� �������� �ɷ�ġ�� ������� �Է��ϼ���.");
			gamer[i]=sc.nextInt();
		}
		
		System.out.println("������ �ɷ�ġ �Է��� �Ϸ� �ƽ��ϴ�. �� ��ʸ�Ʈ�� ���۵˴ϴ�.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ʸ�Ʈ�� ���۵Ǿ����ϴ�.");
		
		System.out.println("������� Ȯ��");
		System.out.print(Arrays.toString(gamer) + " ");
		System.out.println();
		
		int currentGapLevel=0;
		
		while (participate >= 1) {
			int updateParticipate = 0;

			if (participate > 2) {
				for (int i = 0; i <= participate / 2 + 2; i += 2) {
					if (gamer[i] >= gamer[i + 1]) {
						gapLevel[currentGapLevel] = gamer[i] - gamer[i + 1];
						System.out.print("i��� : " + gamer[i] + " ");
						gamer[updateParticipate] = gamer[i];
						updateParticipate++;
					} else if (gamer[i] < gamer[i + 1]) {
						gapLevel[currentGapLevel] = gamer[i + 1] - gamer[i];
						System.out.print("k��� : " + gamer[i + 1] + " ");
						gamer[updateParticipate] = gamer[i + 1];
						updateParticipate++;
					}
					currentGapLevel++;
				}
			} else {
				System.out.println("���� ��� : " + gamer[gamer.length - 2]);
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
