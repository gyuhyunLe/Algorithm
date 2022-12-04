package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.

해결
1. 연결 관계가 있으므로 dfs 탐색으로 접근한다.
2. 1이 출력되면 더이상 탐색하지 않고, 관계 찾지 못했으면 0을 출력한다.
*/
class Ex_11724 {
    static int[][] map = new int[1001][1001];
    static int v; // 정점
    static int u; // 간선
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        u = sc.nextByte();

        for(int i=0; i<u; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        int count = 0;
        for(int i=1; i<=v; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int depth) {
        visited[depth] = true;
        for(int j=1; j<=v; j++) {
            if(map[depth][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}
