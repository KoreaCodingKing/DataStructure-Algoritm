import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.naming.ldap.SortControl;

public class ReverseInteger {
	public static void main(String[] args) {
		int num=123234;
		
		int mok=0;
		int namu=0;
		List<Integer> list=new ArrayList();
		while(true) {
			namu=num%10;
			list.add(namu);
			num/=10;
			if(mok==0 && namu==0) {
				break;
			}
		}
    	Collections.sort(list);
		Iterator iterator = list.iterator();
		String result="";
		while(iterator.hasNext()) {
			result=(Integer) iterator.next()+result;
		}
		System.out.println(Integer.parseInt(result));
	}
}

/*
 * List<String> stick = new ArrayList();
        int answer = 0;
        int count=0;
        String push="(";
        String pop=")";
        String add="()";
        
        for(int i=0;i<arrangement.length();i++){
            stick.add(arrangement.indexOf(i));
            
            if(stick.indexOf(stick.size()).equals(push)){
                count+=answer;
            }else if(stick.indexOf(stick.size()).equals(pop)){
                stick.remove(stick.size());
                stick.remove(stick.size());
                answer--;
            }else if(stick.indexOf(stick.size()).equals(add)){
                stick.remove(stick.size());
                count+=count;
            }
        }
        answer=count;
        
        return answer;
 */
