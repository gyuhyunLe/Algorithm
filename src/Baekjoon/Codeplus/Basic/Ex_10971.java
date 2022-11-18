package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
각 도시간에 이동하는데 드는 비용은 행렬 W[i][j]형태로 주어진다. W[i][j]는 도시 i에서 도시 j로 가기 위한 비용을 나타낸다. 비용은 대칭적이지 않다. 즉, W[i][j] 는 W[j][i]와 다를 수 있다. 모든 도시간의 비용은 양의 정수이다. W[i][i]는 항상 0이다. 경우에 따라서 도시 i에서 도시 j로 갈 수 없는 경우도 있으며 이럴 경우 W[i][j]=0이라고 하자.

해결
1. 모든 지점 방문하는 최소 비용 구한다.
2. 도시간의 비용이 0일 경우 루트가 없기 때문에 조건 설정한다.
3. 모든 도시 방문했으며, 마지막 도시에서 처음 도시로 가는 루트 있으면 최솟값 확인한다.
*/
class Ex_10971 {
    static int[][] arr;
    static boolean[] visited;
    static int n;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            visited[i] = true;
            dfs(i,i,0);
            visited[i] = false;
        }
        System.out.println(result);
    }
    public static void dfs(int start, int end, int sum) {
        for(int i=1; i<n; i++) {
            if(arr[start][end] != 0) {
                result = Math.min(result,sum+arr[start][end]);
            }
            return;
        }
    }


}
