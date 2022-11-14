package src.Baekjoon.Codeplus.Basic;

import java.util.*;
import java.io.*;
/*
문제 - 오늘부터 N+1일째 되는 날 퇴사를 하기 위해서, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
      백준이는 비서에게 최대한 많은 상담을 잡으라고 부탁을 했고, 비서는 하루에 하나씩 서로 다른 사람의 상담을 잡아놓았다.
      각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.

해결 - 1. 점화식 if (i + t[i] <= n) dp[i] = max(dp[i + t[i]], dp[i + t[i]] + p[i])
      2. 일할 수 있는 날짜를 넘어가는 경우, skip
      3.
*/
class Ex_14501 {
    static int max=0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t[] = new int[n+10];
        int p[] = new int[n+10];
        int dp[] = new int[n+10];

        String temp[];

        for (int i = 1; i <= n; i++) {
            temp = br.readLine().split(" ");
            t[i] = Integer.parseInt(temp[0]);
            p[i] = Integer.parseInt(temp[1]);
        }


        for (int i=n;i>0;i--) { //뒤에서부터 검사
            int next = i+ t[i]; //각 상담이 끝나는날
            if (next > n+1 ) {
                dp[i] = dp[i+1];
            }
            else {
                dp[i] = Math.max(dp[i+1],dp[next]+p[i]);
            }
        }
        System.out.println(dp[1]);
    }
}
