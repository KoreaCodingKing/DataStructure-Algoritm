package Test;

/*�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�.
 *  ��� ������ ���ں� ������ K �̻����� ����� ����
 *   Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.
	���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
	Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
	Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, 
	��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ�
	 �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
public class ProgrammersLevel2 {
	public static void main(String[] args) {
		int[] scoville={1,2,3,9,10,12};
		int k=7;
		
		int count=0;
		
		while(true) {
			int lowScoville=0;
			int secLowScoville=0;
			
			for(int i=0;i<scoville.length;i++) {
				for(int j=1;j<scoville.length-1;j++) {
					if(scoville[i]<scoville[j]) {
						lowScoville=scoville[i];
					}
				}
			}
			for(int i=0;i<scoville.length;i++) {
				for(int j=1;j<scoville.length-1;j++) {
					if(scoville[i]<scoville[j] && lowScoville>scoville[i]) {
						secLowScoville=scoville[i];
					}
				}
			}
			
			int subScoville=lowScoville+(secLowScoville*2);
			
			if(subScoville>k) {
				count+=+1;
			}
		}//while
		
		System.out.println(count);
	}//main
}
