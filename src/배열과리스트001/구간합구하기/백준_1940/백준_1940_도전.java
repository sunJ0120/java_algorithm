package 배열과리스트001.구간합구하기.백준_1940;

import java.util.Scanner;

public class 백준_1940_도전 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] sList = new int[N];

        for (int i = 0; i < N; i++) {
            sList[i] = sc.nextInt();
        }

        int start = 0;
        int end = N-1;
        int count = 0;

        //정렬
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < N-i; j++){
                if(sList[j+1] < sList[j]){
                    int a = sList[j];
                    sList[j] = sList[j+1];
                    sList[j+1] = a;
                }
            }
        }

        //투포인터
        while (start < end) {
            if(sList[start] + sList[end] < M){
                start++;
            }else if(sList[start] + sList[end] > M){
                end--;
            }else{
                count++;
                start++;
            }
        }
        System.out.println(count);
    }
}
