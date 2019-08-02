import java.util.Scanner;

/*124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
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
		System.out.print("원하는 값을 입력하세요 : ");
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
//		System.out.println("결과 : " + result);
//	}//Count
}//class
