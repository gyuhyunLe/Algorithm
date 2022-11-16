package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.

해결
1. N과M(1)과 유사한 문제이다.
2. depth 1씩 증가시키며 arr 배열에 값을 넣어준다.
3. 방문한 노드는 재방문하지 않게 visit 배열을 사용한다.
*/
class Ex_10974 {
    static int[] arr;
    static boolean[] visit;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        visit = new boolean[N];
        dfs(0);

    }
    public static void dfs(int depth) {
        if (depth == N) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth+1);
                visit[i] = false;
            }
        }

    }
}
