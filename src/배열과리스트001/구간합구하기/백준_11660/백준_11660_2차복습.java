package 배열과리스트001.구간합구하기.백준_11660;

import java.util.Scanner;

public class 백준_11660_2차복습 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] sList = new int[N + 1][N + 1];

        for(int i = 1; i<N+1; i++){
            for(int j = 1; j<N+1; j++){
                sList[i][j] = sList[i-1][j] + sList[i][j-1] - sList[i-1][j-1] + sc.nextInt();
            }
        }

        for(int i = 0; i<M; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(sList[x2][y2] - sList[x1-1][y2] - sList[x2][y1-1] + sList[x1-1][y1-1]);
        }
    }
}
