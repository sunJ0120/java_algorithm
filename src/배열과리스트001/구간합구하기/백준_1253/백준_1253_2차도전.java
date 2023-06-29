package 배열과리스트001.구간합구하기.백준_1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1253_2차도전 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] sList = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++){
            sList[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = N-1;
        int count = 0;

        for(int i = 0; i<N; i++){
            start = 0;
            end = N-1;
            while(start < end){
                if(start == i){
                    start++;
                }else if(end == i){
                    end--;
                }else{
                    if(sList[start] + sList[end] < sList[i]){
                        start++;
                    }else if(sList[start] + sList[end] > sList[i]){
                        end--;
                    }else {
                        count++;
                        start = N-1; //while문 나가기 위함
                        end = 0;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
