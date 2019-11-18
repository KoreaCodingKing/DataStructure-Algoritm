import java.util.*;
public class test {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        
        int a=Math.abs(x-w);
        int b=Math.abs(y-h);
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        list.add(h);
        list.add(w);
        list.add(a);
        list.add(b);
        list.add((int)Math.sqrt(a*a+b*b));
        
        for(int value:list){
            pq.add(value);
        }
        
        System.out.println(pq.poll());
    }
}
