import java.util.HashMap;

/*로마문자를 숫자로*/
public class RomanToInteger {
	public static void main(String[] args) {		
		String s = "IIII";
		
		HashMap<Character, Integer> romanInt=new HashMap<Character, Integer>();
		romanInt.put('I',1);
		romanInt.put('V',5);
		romanInt.put('X',10);
		romanInt.put('L',50);
		romanInt.put('C',100);
		romanInt.put('D',500);
		romanInt.put('M',1000);
	
	    int result=0;
	    
	    for(int i=0;i<s.length();i++) {
	    	char currentC = s.charAt(i);
	    	if(i != s.length()-1 && romanInt.get(currentC)<romanInt.get(s.charAt(i+1))) {
	    		result += romanInt.get(s.charAt(i+1))-romanInt.get(currentC);
	    		i++;
	    	}else {
	    		result+=romanInt.get(currentC);
	    	}
	    }
	    
	    System.out.println(result);
	}
}
