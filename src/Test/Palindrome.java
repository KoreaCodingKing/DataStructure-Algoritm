package Test;

/* �յڸ� ����� �Ȱ��� ���ڿ��� �Ӹ����(palindrome)�̶�� �մϴ�.
	���ڿ� s�� �־��� ��, s�� �κй��ڿ�(Substring)�� ���� �� �Ӹ������ ���̸� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	�������, ���ڿ� s�� abcdcba�̸� 7�� return�ϰ� abacde�̸� 3�� return�մϴ�.
*/
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String s="abacde";
		
		int answer=0;
		
		for(int i=0;i<s.length();i++) {
			
			while(true) {
				int endpoint=s.length()-1;
				if(s.substring(i)==s.substring(endpoint)) {
					answer=endpoint-i+1;
					break;
				}else {
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
