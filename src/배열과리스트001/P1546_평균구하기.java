package 배열과리스트001;
import java.util.Scanner;

public class P1546_평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		float nSum = 0;
		float nAnswer = 0;
		float nMax = 0;
		float sAnswer = 0;
		float[] nlist= new float[1000];
		float answer = 0;
		
		for(int i=0; i< N; i++) {
//			Scanner sc1 = new Scanner(System.in);
			int n = sc.nextInt();
			nSum += (float)n;
			nlist[i] = n;
			
			if(nMax < n) {
				nMax = n;
			}
		}
		
		for(int j = 0; j < N; j++) {
			nlist[j] = nlist[j]/nMax*100;
			sAnswer += nlist[j];
		}
		
		answer = sAnswer/N;
		
		System.out.println(answer);
	
	}

}
