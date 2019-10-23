package Test;

import java.util.*;
public class NaverTest03 {
	public static void main(String[] args) {
		int[] progresses= {93,30,55};
		int[] speeds= {1,30,5};
		
		Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0;i<progresses.length;i++){
            q.add((100-progresses[i])%speeds[i]==0 ? (100-progresses[i])/speeds[i] :
                 (100-progresses[i])/speeds[i]+1);
        }
        
        List<Integer> list = new ArrayList<>();
        int start = q.poll();
        int count=1;
        
        while(!q.isEmpty()){
            int next = q.poll();
            
            if(start >= next){
                count++;
            }else {
                list.add(count);
                count=1;
                start = next;
            }
        }
        
        list.add(count);
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));;
    }
}
