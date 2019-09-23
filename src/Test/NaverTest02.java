package Test;

// ���� Ż�� ����
// # : ���, * : 1�� ��� 2�� ����, > : �������� ��ĭ, < : ���������� ��ĭ
public class NaverTest02 {
	public static void main(String[] args) {
		String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
		
		int result=0;
		int start=0;
		
		for(;start<6;start++) {
			int j=0;
			int i=start;
			int scount=0;
			int count =0;
			
			for(;j<6;j++) {
				String str=drum[j];
				char ch = str.charAt(i);
				
				switch(ch) {
					case '#':
						count++;
						break;
					case '>':
						i++;
						count++;
						if(str.charAt(i)=='*') {
							scount++;
							if(scount==2) {
								count++;
							}
						}else if(str.charAt(i)=='>') {
							i++;
							j--;
							count--;
						}
						break;
					case '<':
						i--;
						count++;
						if(str.charAt(i)=='*') {
							scount++;
							if(scount==2) {
								count++;
							}
						}else if(str.charAt(i)=='<') {
							i--;
							j--;
							count--;
						}
						break;
					case '*':
						scount++;
						count++;
						if(scount==2) {
							count++;
						}
						break;
				}
				System.out.print("1ĭ ��, ");
			}//for
			
			System.out.print(start+1 + "ȸ��");
			
			if(count==6) {
				result+=1;
				System.out.println(" ����");
			}else {
				System.out.println(" ����");
			}
		}//while
		
		System.out.println("��� ���� ���� : " + result);
	}
}
