package src.codeplus.Algorithm_basic;

import java.util.Scanner;

/*
문제 -  자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
       1부터 N까지 자연수 중에서 M개를 고른 수열
       같은 수를 여러 번 골라도 된다.

해결 -  1. 중복 상관 없으므로 visited 배열 없이 진행한다.
       2. M == depth 까지 재귀호출하여 arr배열에 담는다.
*/
public class study04 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];
        dfs(0);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }
        for(int i=1; i<=N; i++) {
            arr[depth] = i;
            dfs(i+1);
        }
    }
}
