import java.util.ArrayList;

/*
 * 프린트 대기목록이 배열로 되어있다
 * 이 대기 목록은 우선순위로 담겨져 있는데 index i번째에 있는 대기 목록의 프린트를
 * 몇번째에 뽑히는지 맞춰보즈아ㅏㅏ
 * 만약 우선순위가 같다면 우선순위가 높은것의 오른쪽으로 우선순위를 두고 그다음 왼쪽편은 왼쪽순으로*/
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
