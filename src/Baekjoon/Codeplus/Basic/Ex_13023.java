package src.Baekjoon.Codeplus.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제
BOJ 알고리즘 캠프에는 총 N명이 참가하고 있다. 사람들은 0번부터 N-1번으로 번호가 매겨져 있고, 일부 사람들은 친구이다.
오늘은 다음과 같은 친구 관계를 가진 사람 A, B, C, D, E가 존재하는지 구해보려고 한다.

A는 B와 친구다.
B는 C와 친구다.
C는 D와 친구다.
D는 E와 친구다.
위와 같은 친구 관계가 존재하는지 안하는지 구하는 프로그램을 작성하시오.

해결
1. 연결 관계가 있으므로 dfs 탐색으로 접근한다.
2. 1이 출력되면 더이상 탐색하지 않고, 관계 찾지 못했으면 0을 출력한다.
*/
class Ex_13023 {
    static int n;
    static List<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        list = new ArrayList[n];
        for(int i=0; i<n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        for(int i=0; i<n; i++) {
            visited = new boolean[n];
            dfs(i,0);
        }
        System.out.println(0);
    }
    public static void dfs(int temp, int depth) {
        if(depth == 4) {
            System.out.println(1);
            System.exit(0);
        }
        visited[temp] = true;
        for(int i=0; i<list[temp].size(); i++) {
            int j = list[temp].get(i);
            if(visited[j] == false) {
                visited[j] = true;
                dfs(j,depth+1);
                visited[j] = false;
            }
        }
    }
}
