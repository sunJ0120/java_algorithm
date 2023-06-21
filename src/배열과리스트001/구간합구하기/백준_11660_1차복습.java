package 배열과리스트001.구간합구하기;

import java.util.Scanner;

/**
 * 1차 복습 성공 = Scanner 사용법만 내일 정리하기
 */

public class 백준_11660_1차복습{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] Slist = new long[N + 1][N + 1];

        for(int i = 1; i<= N; i++){
            for(int j = 1; j <= N; j++) {
                Slist[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i<= N; i++){
            for(int j = 1; j <= N; j++) {
                long num = Slist[i][j];
                Slist[i][j] = num - Slist[i-1][j-1] + Slist[i][j-1] + Slist[i-1][j];
            }
        }

        for(int i = 0; i < 3; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            long answer = Slist[x2][y2] - Slist[x1-1][y2] - Slist[x2][y1-1] + Slist[x1-1][y1-1];

            System.out.println(answer);
        }
    }

}
