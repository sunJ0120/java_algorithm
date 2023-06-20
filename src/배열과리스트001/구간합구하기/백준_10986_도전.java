import java.util.Scanner;

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

        for(int i = 0; i < N; i++){
            listSum[i+1] = listSum[i] + listSum[i+1];
        }

        for(int i = 0; i < N; i++){
            listSum[i+1] %= M;
            if((listSum[i+1] % M) == 0){
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
