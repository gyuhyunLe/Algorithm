package src.Baekjoon.Codeplus.Basic;
/*
문제
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 3가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다. 단, 같은 수를 두 번 이상 연속해서 사용하면 안 된다.
1+2+1
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

해설
dp[n][1] = dp[n-1][2] + dp[n-1][3]
dp[n][2] = dp[n-2][1] + dp[n-2][3]
dp[n][3] = dp[n-3][1] + dp[n-3][2]
이 공식으로 수가 long의 범위 안에 있는 것만 확인해주면 된다.
dp[n][1] = (dp[n-1][2] % 1000000009 + dp[n-1][3] % 1000000009) % 1000000009 를 해주면 된다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_15990 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int max = 0;
    int[] ns = new int[t];
    for (int i = 0 ; i < t; i++) {
        int n = Integer.parseInt(br.readLine());
        ns[i] = n;
        max = Math.max(max, n);
    }
    long[][] dp = new long[100001][4];
    dp[1][0] = dp[1][3] = 1;
    dp[2][1] = dp[2][3] = 1;
    dp[3][0] = dp[3][1] = dp[3][2] = 1;
    dp[3][3] = 3;
    for (int i = 4; i <= max; i++) {
        dp[i][0] = ((dp[i-1][1]%1000000009) + (dp[i-1][2]%1000000009))%1000000009;
        dp[i][1] = ((dp[i-2][0]%1000000009) + (dp[i-2][2]%1000000009))%1000000009;
        dp[i][2] = ((dp[i-3][0]%1000000009) + (dp[i-3][1]%1000000009))%1000000009;
        dp[i][3] = (dp[i][0]+dp[i][1]+dp[i][2]) % 1000000009;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < t; i++) {
        int num = ns[i];
        sb.append(dp[num][3] + "\n");
    }
    System.out.print(sb);
    }
}
