package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
2*n 직사각형을 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

해결
1. dp[1] , dp[2] .. 일정한 패턴이 반복된다.
2. dp[n] = dp[n-2] + dp[n-1] 점화식으로 구현한다.
*/
class Ex_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
