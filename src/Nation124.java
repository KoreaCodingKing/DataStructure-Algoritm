import java.util.Scanner;

/*124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.

124 ���󿡴� �ڿ����� �����մϴ�.
124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
1-1
2-2
3-4
4-11
5-12
6-14
7-21
8-22
9-24
10-41
 * */
public class Nation124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		int n =sc.nextInt();
		
		Count(n);
	}
	
	public static void Count(int n) {
		String result="";
		int namu;

        while(n>0){
            namu = n%3;
            n = n/3;

            if(namu == 0){
                n -= 1;
                namu = 4;
            }
            
            result=namu+result;
        }//while
        System.out.println(result);
	}//count
	
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	public static void Count(int n) {
//		StringBuffer mok=new StringBuffer();
//		StringBuffer namu=new StringBuffer();
//		int iMok=n/3;
//		int iNamu=n%3;
//		while(true) {
//			if(iNamu==0) {
//				iMok=iMok-1;
//				mok.append(iMok);
//				if(iMok==0) {
//					mok.deleteCharAt(iMok);
//				}
//				namu.append(4);
//				iMok/=3;
//				iNamu%=3;
//				if(iMok<2) {
//					break;
//				}else {
//					continue;
//				}		
//			}else if(iNamu!=0) {
//				mok.append(iMok);
//				namu.append(iNamu);
//				iMok/=3;
//				iNamu%=3;
//				if(iMok<2){
//					break;
//				}else {
//					continue;
//				}
//			}
//		}//while
//		StringBuffer result=new StringBuffer(mok.lastIndexOf(""));
//		result.append(namu.reverse());
//		System.out.println("��� : " + result);
//	}//Count
}//class
