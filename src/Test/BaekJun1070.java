package Test;

import java.util.*;
public class BaekJun1070 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int horizon=sc.nextInt();
		int vertical=sc.nextInt();
		
		String[][] location=new String[horizon][vertical];
		
		for(int i=0;i<horizon;i++) {
			for(int j=0;j<vertical;j++) {
				location[i][j]=sc.next();
			}
		}
		
		int[] blockSize=new int[26];
		
		for(int i=0;i<26;i++) {
			blockSize[i]=sc.nextInt();
		}
		
		for(int i=0; i<horizon;i++) {
			for(int j=0;j<vertical;j++) {
				if(location[i][j].equals("-")) {
					
				}
			}
		}
	}
}
