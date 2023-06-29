package 배열과리스트001.구간합구하기.백준_1253;

/**
 * StringTokenizer랑 BufferedReader는 일단 계속 보고 따라 치면서
 * 사용법을 익힐 필요가 있을 듯
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_1253_도전 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] sList = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            sList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sList); //정렬

        int start= 0;
        int end = N - 2;
        int val = N - 1;
        int count = 0;

        while(val > 1){
            if (start > end) { //해당하는 값이 없는 것이므로 초기화
                start = 0;
                val--;
                end = val-1;
            }else{
                if(sList[start] + sList[end] < sList[val]){
                    start++;
                }else if(sList[start] + sList[end] > sList[val]){
                    end--;
                }else {
                    count++;
                    start = 0;
                    val--;
                    end = val-1;
                }
            }
        }
        System.out.println(count);
        bf.close();
    }
}
