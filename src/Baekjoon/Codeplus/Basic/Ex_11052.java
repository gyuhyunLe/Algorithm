package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
카드 팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최댓값을 구하는 프로그램을 작성하시오. N개보다 많은 개수의 카드를 산 다음, 나머지 카드를 버려서 N개를 만드는 것은 불가능하다. 즉, 구매한 카드팩에 포함되어 있는 카드 개수의 합은 N과 같아야 한다.

해결
1. 카드 1개 들어있는 카드팩 구매하고 카드 i-1개를 구매한다.
2. 카드 2개 들어있는 카드팩 구매하고 카드 i-2개를 구매한다.
*/
class Ex_11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt(); //카드팩 저장한다.
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + arr[j]);
            }
        }
        System.out.println(dp[n]);
    }
}
