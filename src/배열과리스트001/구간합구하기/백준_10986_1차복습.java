package 배열과리스트001.구간합구하기;

import java.util.Scanner;

public class 백준_10986_1차복습 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;

        int[] Slist = new int[N];
        int[] Ilist = new int[N];

        for(int i = 0; i < N; i++){
            Slist[i] = sc.nextInt();
        }

        for(int i = 0; i < N-1; i++){
            Slist[i+1] = Slist[i]+Slist[i+1];
        }

        for(int i = 0; i < N; i++){
            Slist[i] = Slist[i]%M;
            if(Slist[i] == 0){
                count++;
            }
        }

        for(int i = 0; i < N; i++){
            Ilist[Slist[i]]++;
        }

        for(int i = 0; i < N; i++){
            if(Ilist[i] != 0){
                count += ((Ilist[i] * (Ilist[i]-1))/2);
            }
        }

        System.out.println(count);
    }
}

