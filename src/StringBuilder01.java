/* StringBuilder에 대해서 알아보자*/

//class에 StringBuilder로 쓰면 얘가 Object의 StringBuilder로 인식해서 동작안됨
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
