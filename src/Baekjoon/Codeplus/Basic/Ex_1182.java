package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.

해결
1. 인덱스 depth 더하거나 더하지 않을 때 경우로 나눈다.
2. depth == N 일 때 원소 더한 값이 S일 경우 return 한다.
3.
*/
class Ex_1182 {
    static int[] arr;
    static int N;
    static int S;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0,0);
        if(S == 0) {
            System.out.println(result - 1);
        } else {
            System.out.println(result);
        }
    }
    public static void dfs(int sum, int depth) {
        if(N == depth) {
            if(sum == S) {
                result++;
            }
            return;
        }
        dfs(sum+arr[depth],depth+1);
        dfs(sum,depth+1);
    }
}
