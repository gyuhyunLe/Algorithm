package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.
로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.
예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다. ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])
집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.

해결
1. 종료조건 depth 6일 떄 배열 출력한다.
2. depth 1씩 증가시키며 for문 조건 값에 i=start 로 result 배열에 값을 넣어준다.
3. 방문한 노드는 재방문하지 않게 visit 배열을 사용한다.
*/
class Ex_6603 {
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0,0);
    }
    public static void dfs(int start, int depth) {
        if(n == depth) {
            for(int i=0; i<n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        for(int i=start; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }
    }
}
