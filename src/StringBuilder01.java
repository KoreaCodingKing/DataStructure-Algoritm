/* StringBuilder�� ���ؼ� �˾ƺ���*/

//class�� StringBuilder�� ���� �갡 Object�� StringBuilder�� �ν��ؼ� ���۾ȵ�
public class StringBuilder01 {
	public static void main(String[] args) {
		StringBuilder strBuf = new StringBuilder();
		strBuf.append(25);
		System.out.println(strBuf);
		strBuf.append('Y').append(true);
		System.out.println(strBuf);
		
		strBuf.insert(2,false);
		System.out.println(strBuf);
		
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println(strBuf);
	}
}
