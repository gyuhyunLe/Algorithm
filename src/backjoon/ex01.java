package src.backjoon;
/*
문제 - 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
      단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

해결 -   한 노드에서 갈 수 있는 노드 중 하나를 선택한다
        선택한 노드에서 갈 수 있는 노드 중 하나를 선택한다. 이 때 이미 방문한 노드는 제외하고 선택한다.
        갈 수 있는 노드가 존재하지 않으면 이전 노드로 돌아와서 갈 수 있는 노드 중 하나를 선택한다.

        한 노드에서 갈 수 있는 노드를 큐에 추가한다.
        큐에서 노드를 하나 꺼내어 꺼낸 노드에서 갈 수 있는 노드를 큐에 추가한다.
        큐에 노드가 존재하지 않으면 break한다.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class ex01 {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();   // 정점의 개수
        int M = scan.nextInt();   // 간선의 개수
        int V = scan.nextInt();   // 탐색을 시작할 정점 번호

        //인접행렬 생성
        arr = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println(123);

        visited = new boolean[N + 1];
        bfs(V);
    }
    //깊이우선탐색(재귀)
    public static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V == arr.length) {
            return;
        }
        for(int j = 1; j < arr.length; j++) {
            //연결은 되어있는데, 방문하지 않았다면 재귀
            if(arr[V][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }

    //너비우선탐색(큐)
    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
