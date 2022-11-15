package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
스타트 팀: S12 + S21 = 1 + 4 = 5
링크 팀: S34 + S43 = 2 + 5 = 7
1, 3번이 스타트 팀, 2, 4번이 링크 팀에 속하면, 두 팀의 능력치는 아래와 같다.
스타트 팀: S13 + S31 = 2 + 7 = 9
링크 팀: S24 + S42 = 6 + 4 = 10
축구를 재미있게 하기 위해서 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다.
위의 예제와 같은 경우에는 1, 4번이 스타트 팀, 2, 3번 팀이 링크 팀에 속하면 스타트 팀의 능력치는 6, 링크 팀의 능력치는 6이 되어서 차이가 0이 되고 이 값이 최소이다.

해결
1. 팀을 나누고 팀별 능력치를 계산하여 갱신
2. team1이 결성 되면 나머지 값은 team2가 된다.
3. team_a, team_b의 능력치에 대해 최소값을 찾는다.
4. dfs 방문 함수, 투 팀의 능력치 차이를 계산하는 diff 함수를 선언한다.
*/
class Ex_15661 {
    static int N, temp;
    static int[][] map;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        temp = Integer.MAX_VALUE;
        visit = new boolean[N];
        dfs(0,0);
        System.out.println(temp);
    }
    public static void dfs(int startIdx, int depth) {
        if(depth == N) {
            diff();
            return;
        }
        visit[depth] = true;
        dfs(startIdx,depth+1);
        visit[depth] = false;
        dfs(startIdx, depth+1);
    }
    public static void diff() {
        int team_a = 0;
        int team_b = 0;

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(visit[i] == true && visit[j] == true) {
                    team_a += map[i][j];
                    team_a += map[j][i];
                } else if(visit[i] == false && visit[j] == false) {
                    team_b += map[i][j];
                    team_b += map[j][i];
                }
            }
        }
        int count = Math.abs(team_a-team_b);
        if(count < temp) {
            temp = count;
        }
    }
}
