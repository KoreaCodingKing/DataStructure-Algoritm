/*괄호조건 맞는지 틀리는지 열고 닫는게 존재해야함*/
public class AdvancedStack {
	public static void main(String[] args) {
		String s="[({(())}[()])]";
		int size=s.length();
		char[] carr=new char[size];
		int check=0;
		for(int i=0;i<size;i++) {
			char c=s.charAt(i);
			if(c=='{' || c=='(' || c=='[') {
				carr[check]=c;
				check++;
			}else if(c=='}' || c==')' || c==']') {
				if(carr[check-1]=='{' && c=='}') {
					check--;
				}else if(carr[check-1]=='(' && c==')') {
					check--;
				}else if(carr[check-1]=='[' && c==']') {
					check--;
				}
			}
		}//for
		if(check==0) {
			System.out.println(true);
		}else if(check!=0) {
			System.out.println(false);
		}
	}
	
}
