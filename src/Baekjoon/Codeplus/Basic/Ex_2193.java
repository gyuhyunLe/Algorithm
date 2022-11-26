package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
0과 1로만 이루어진 수를 이진수라 한다. 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데, 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.
이친수는 0으로 시작하지 않는다.
이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
예를 들면 1, 10, 100, 101, 1000, 1001 등이 이친수가 된다. 하지만 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아니다.

해결
1. 2진수이기 떄문에 n자리 올 수 있는 수는 0과 1이다.
2. n-2 위치는 0 or 1, n-1 위치는 0, n 위치는 1
*/
class Ex_2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        long dp[] = new long[count+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=count; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[count]);
    }
}
