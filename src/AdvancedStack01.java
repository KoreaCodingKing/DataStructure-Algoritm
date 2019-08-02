import java.util.Stack;

/*
 * ( push
 * ) pop + add
 * () add
 * */
public class AdvancedStack01 {
	public static void main(String[] args) {

	String arrangement="()(((()())(())()))(())";
		
	Stack<Integer> stack = new Stack<Integer>();
	  int count = 0;
        for(int i = 0; i < arrangement.length(); i++) {
            if(arrangement.charAt(i) == '(') {
                stack.push(1);
            }else {
                stack.pop();
                if(arrangement.charAt(i-1) == '(') 
                	count += stack.size();
                else {
                	count++;
                }
            } 
	            
        }
        System.out.println(count);
    }
}

