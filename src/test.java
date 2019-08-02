
public class test {
	public static void main(String[] args) {
		String str = "";
		int n = str.length();
		char[] carr = new char[n];
		
		int k=1;
		for(int i=0;i<carr.length;i++) {
			carr[i]=str.substring(0).charAt(i);
		}
		
		for(int j=0; j<carr.length;j++) {
			carr[j]=(char) ((int)carr[j]+k);
		}
		
		
		
	}
}
