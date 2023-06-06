package 배열과리스트001.구간합구하기;

import java.util.Scanner;

public class P11659_구간합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		
		int[] nlist = new int[n+1];
		int[] nSum = new int[n+1];
		
		nSum[0]= 0;
		nlist[0] = 0;
		
		for(int i = 1; i<n+1; i++) {
			nlist[i] = sc.nextInt(); //배열 저장
		}
		
		for(int i = 1; i<n+1; i++) {
			nSum[i] = nlist[i] + nSum[i-1]; //구간합 배열 구하기
		}
		
		for(int j = 0; j<z; j++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(nSum[n2] - nSum[n1-1]);
		}

	}

}
