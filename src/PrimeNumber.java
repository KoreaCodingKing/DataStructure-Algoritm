import java.util.Scanner;

/* 입력값을 받아 입력값 안에 있는 숫자 중 소수의 개수를 구하자
 * */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		int count=0;
	      for(int i=1;i<=n;i++){
	  		int k=0;
	          for(int j=1;j<=i;j++){
	            if(i%j==0){
	               k++;
	            }
	          }
	          if(k==2){
		         count++;
		      }
	      }
	      System.out.println(count);
	}//main
}//class
