package 배열과리스트001.구간합구하기;

import java.util.Scanner;

public class 백준_2018_도전 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Slist[] = new int[N];

        for(int i = 0; i<N; i++){
            Slist[i] = i+1;
        }

        int start_index = 0;
        int end_index = 0;
        int count = 1;
        int sum = 0;

        while(start_index <= N/2+1){
            if(sum>N){
                sum = sum - Slist[start_index];
                start_index++;

            }else if(sum<N){
                sum = sum+Slist[end_index];
                end_index++;

            }else{
                sum = sum + Slist[end_index];
                end_index++;
                count++;
            }
        }
        System.out.println(count);
    }
}
