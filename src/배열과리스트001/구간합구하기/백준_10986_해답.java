package 배열과리스트001.구간합구하기;
import java.util.Scanner;

/**
 * 체크할 부분
 * 1. 나머지가 같은 수들을 저장할 배열을 생성
 * 2. 해당 배열의 인덱스를 나머지 값으로 하여 구별
 * 3. 합 배열을 따로 만들지 않고, 첫 인덱스 값만 받은 뒤 바로 sc.nextInt로 받아와서 더하기
 */

public class 백준_10986_해답 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M]; //몇~으로 나누어 떨어지는 이런 것이므로 전부 M 이하이다. 그러므로 M을 적으면 전부 포괄 가능하다.
        long answer = 0;

        //배열에 받아올 필요 없이 바로바로 합 배열 먼저 구하는 것
        S[0] = sc.nextInt(); //합 배열 이니까 미리 받아오는 것이다.
        for(int i = 1; i < N; i++){
            S[i] = S[i - 1] + sc.nextInt(); //sc.nextInt(); 이런식으로 변수 없이 바로 불러올 수 있다.
        }

        for(int i = 0; i < N; i++){ //합 배열의 모든 값에 % 연산 수행하기
            int remainder = (int) (S[i] % M);

            //0~i까지의 구간 합 자체가 0일때 정답 구하기
            if(remainder == 0) answer++;
            //나머지가 같은 인덱스의 개수 카운팅하기
            C[remainder]++;
        }

        for(int i = 0; i<M; i++){
            if(C[i] > 1){
                //나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
                answer = answer + (C[i] * (C[i] -1 )/2);
            }
        }

        System.out.println(answer);
    }
}
