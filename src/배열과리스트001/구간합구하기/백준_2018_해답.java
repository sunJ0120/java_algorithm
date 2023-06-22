package 배열과리스트001.구간합구하기;

import java.util.Scanner;

/**
 * 투 포인터 개념은 두개의 인덱스를 움직이면서 범위를 지정해 구간합을 logn으로 구하는 것이다.
 * 여기서 중요한 것은, 어짜피 배열 내부의 수와 인덱스가 같으므로, 직접 배열을 생성할 필요 없이
 * 인덱스를 숫자 1로 시작하여 계산하면 결괏값을 얻을 수 있다는 것이다.
 */

public class 백준_2018_해답 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index !=N){
            if(sum == N){ //현재 연속합이 N과 같은 경우
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index; //현재 연속 합이 N보다 큰 경우
                start_index++;
            }else{ //현재 연속 합이 N보다 작은 경우
                end_index++;
                sum = sum + end_index;
            }
        }

        System.out.println(count);
    }
}
