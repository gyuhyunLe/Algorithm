package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제 - 오늘부터 N+1일째 되는 날 퇴사를 하기 위해서, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
      백준이는 비서에게 최대한 많은 상담을 잡으라고 부탁을 했고, 비서는 하루에 하나씩 서로 다른 사람의 상담을 잡아놓았다.
      각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.

해결 - 1. 모든 조합의 경우의 수를 탐색하여 투 팀의 능력치가 최소가 되는 수를 찾는다.
      2. 팀 인원수 N, 2차원 배열 map, 방문 여부 visit 배열을 선언한다.
      3. dfs 방문 함수, 투 팀의 능력치 차이를 계산하는 diff 함수를 선언한다.
*/
class Ex_14889 {
    static int N;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N]; //조합
        visit = new boolean[N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0,0);
        System.out.println(Min);
    }

    public static void dfs(int startIdx, int depth) {
        if(depth == N/2) {
            diff();
            return;
        }
        for(int i=startIdx; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                dfs(i+1,depth+1);
                visit[i] = false;
            }
        }
    }

    public static void diff() {
        int team_a = 0;
        int team_b = 0;

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(visit[i] == true && visit[j] == true) {
                    team_a += map[i][j];
                    team_a += map[j][i];
                } else {
                    team_b += map[i][j];
                    team_b += map[j][i];
                }
            }
        }
        int count = Math.abs(team_a-team_b);

        if(count == 0) {
            System.out.println(count);
        }
        Min = Math.min(Min,count);
    }
}
