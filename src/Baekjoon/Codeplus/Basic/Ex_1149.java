package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

해결
1. N개의 집을 빨강,초록,파랑 이용하여 이웃집과 겹치지 않게 칠하는데 드는 최소 가격
2. R로 칠한 경우, G로 칠한 경우, B로 칠한 경우
*/
class Ex_1149 {
    static int n;
    static int dp[][], cost[][]; //비용 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dp = new int[1001][3];
        cost = new int[1001][3];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }
        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }
}
