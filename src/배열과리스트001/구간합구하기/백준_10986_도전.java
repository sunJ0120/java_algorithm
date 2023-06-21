import java.util.Scanner;

/**
 * 검사해보니, list는 내가 i <= N+1이라고 포함해서 그렇지
 * (index가 하나씩 더 작다는걸 망각함)
 * 인덱스 설정 자체에 대한 문제는 없다.
 */

public class 백준_10986_도전 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 0;

        long[] listSum = new long[N+1];

        for(int i = 1; i < N+1; i++){
            int m = sc.nextInt();
            listSum[i] = m;
        }

        for(int i = 1; i < N+1; i++){
            listSum[i] = listSum[i] + listSum[i-1];
        }

        for(int i = 1; i < N+1; i++){
            listSum[i] %= M;
            if((listSum[i] % M) == 0){
                answer += 1;
            }
        }

        for(int i = 1; i < N+1; i++){
            int Cnum = 1;
            int Snum = 1;
            for(int j = i+1; j < N+1; j++){
                if(listSum[i] == listSum[j]){
                    Snum += 1;
                }
            }

            for(int k = 1; k <= Snum; k++){
                Cnum *= k;
            }
            answer += (Cnum/2);
        }
        System.out.println(answer);
    }
}
