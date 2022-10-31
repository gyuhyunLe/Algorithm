package src.programmers.week7;
/*
문제 - n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
      노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.

해결 -   1. distance[n+1]을 선언한다 : 1번 노드와의 거리를 담는 배열
        2. BFS : 1번 노드부터 시작해 주위 인접 노드를 방문한다.
        3. 방문한 2, 3번 노드는 노드 1에서 1만큼 떨어져 있으므로 distance[2] = 3, distance[3] = 3이다.
        이미 방문했으니 해당 노드는 visited[2] = true, visited[3] = true로 방문표시한다.
        4. 2번 노드에서 인접한 5번 4번 노드를 탐색한다. 이들은 각각 1에서 2만큼 떨어져있다.
        distance[5] = 2, distance[4] = 2로 설정하고 visited 표기
        5. 3번 노드에서 인접한 6번 노드를 살펴본다 (4번노드는 이미 방문했으므로 재탐색 x)
        distance[6] = 2로 설정한다.
        6. distance를 오름차순으로 정렬한다. 가장 맨 끝값 (1과 가장 먼 노드의 거리)을 max로 두고 max와 같은 크기의 distance를 센다.
        7. 센 개수를 answer로 반환한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/49189
*/
import java.util.*;
class week7_2 {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] distance = new int[n + 1];

        for (int i = 0; i < n + 1; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        boolean[] visited = new boolean[n + 1];
        visited[1] = true;
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(1);
        while (bfs.size() != 0) { // 2~n까지 도착하는 경로 구하기
            int nowNode = bfs.poll();
            ArrayList<Integer> node = graph.get(nowNode);
            for(int i = 0; i < node.size(); i++) {
                if (visited[node.get(i)] == false) {
                    bfs.add(node.get(i));
                    visited[node.get(i)] = true;
                    distance[node.get(i)] = distance[nowNode] + 1;
                }
            }
        }
        Arrays.sort(distance);
        int max = distance[distance.length-1];
        for(int i = distance.length-1; distance[i] == max; i--)
            answer++;
        return answer;
    }
}
