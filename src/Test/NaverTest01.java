package Test;

// 주어진 이메일들의 유효성 검사
// @과 .은 무조건 1개이상, 마지막 세글자 .net/.com/.org, @(사이에 도메인 주소 있어야함).
public class NaverTest01 {
	public static void main(String[] args) {
		String[] emails = {"sss@x.com", "qwe@qw@.net", "qw.ww.org", "ssss@ww.ttt", "eee@didi.org"};
		
		int result=0;
		
		for(int i=0;i<emails.length;i++) {
			int atCount=0;
			String email = emails[i];
			
			String text="";
			String str="";
			
			System.out.println(email);
			text = email.substring(email.length()-4, email.length());
			str = email.substring(0,email.length()-3);
			
			System.out.print(text + " , ");
			System.out.print(str + " , ");
			
			char[] ch = str.toCharArray();
			
			System.out.println(ch[ch.length-2] + " , ");
			
			for(int j=0;j<ch.length;j++) {
				if(ch[j]=='@') {
					atCount++;
				}
			}//for ch
			
			System.out.println(atCount);
			
			if(((text.equals(".net")) || (text.equals(".org")) || (text.equals(".com"))) 
					&& ((atCount>=1) && (ch[ch.length-2]!='@'))){
				result++;
			}
			
			
			System.out.println(result);
		}//for
		
		System.out.println("유효 이메일의 개수 : " + result);
	}
}
