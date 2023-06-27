package 배열과리스트001.구간합구하기.백준_2018;

import java.util.Scanner;

public class 백준_2018_1차복습 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1; //기본적으로 자기 자신이 있으므로 1부터

        while(start <= (N/2 + 1) || end < N){
            if(sum < N){
                end++;
                sum += end;
            }else if(sum > N){
                sum -= start;
                start++;
            }else{
                count++;
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
