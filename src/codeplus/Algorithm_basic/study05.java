package src.codeplus.Algorithm_basic;

import java.util.Scanner;

/*
문제 -   자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
        1부터 N까지 자연수 중에서 M개를 고른 수열
        같은 수를 여러 번 골라도 된다.
        고른 수열은 비내림차순이어야 한다.
        길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.

해결 -  1. 비내림차순이므로 i 값을 +1 하지 않고 그대로 넘겨준다.
       2. M == depth 까지 재귀호출하여 arr배열에 담는다.
*/
import java.util.*;
public class study05 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];
        dfs(1,0);
    }

    public static void dfs(int count, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = count; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
