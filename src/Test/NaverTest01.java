package Test;

// �־��� �̸��ϵ��� ��ȿ�� �˻�
// @�� .�� ������ 1���̻�, ������ ������ .net/.com/.org, @(���̿� ������ �ּ� �־����).
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
		
		System.out.println("��ȿ �̸����� ���� : " + result);
	}
}
