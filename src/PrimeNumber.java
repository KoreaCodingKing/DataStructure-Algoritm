import java.util.Scanner;

/* �Է°��� �޾� �Է°� �ȿ� �ִ� ���� �� �Ҽ��� ������ ������
 * */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
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
