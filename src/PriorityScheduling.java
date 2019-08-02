import java.util.ArrayList;

/*
 * ����Ʈ ������� �迭�� �Ǿ��ִ�
 * �� ��� ����� �켱������ ����� �ִµ� index i��°�� �ִ� ��� ����� ����Ʈ��
 * ���°�� �������� ���纸��Ƥ���
 * ���� �켱������ ���ٸ� �켱������ �������� ���������� �켱������ �ΰ� �״��� �������� ���ʼ�����*/
public class PriorityScheduling {
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int size=priorities.length;
		ArrayList<Integer> schedule=new ArrayList();
		int maxPriorities=0;
		int location=priorities[3];
		int answer=0;
		
		for(int i=0;i<size-1;i++) {
			if(priorities[i]>priorities[i+1]) {
				maxPriorities=priorities[i];
			}
		}
		schedule.add(maxPriorities);
		
		for(int i=0;i<size;i++) {
			if(maxPriorities==priorities[i]) {
				for(int j=i+1;j<size-1;j++) {
					if(priorities[j]<priorities[j+1]) {
						int temp=priorities[j+1];
						priorities[j+1]=priorities[j];
						priorities[j]=temp;
					}
					schedule.add(priorities[j]);
				}
				for(int j=0;j<i-1;j++) {
					if(priorities[j]<priorities[j+1]) {
						int temp=priorities[j+1];
						priorities[j+1]=priorities[j];
						priorities[j]=temp;
					}
					schedule.add(priorities[j]);
				}
			}
		}
		
		answer=schedule.indexOf(location);
		System.out.println(answer);
	}
}
