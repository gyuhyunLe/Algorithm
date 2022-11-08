package src.backjoon;

import java.util.Scanner;

/*
문제 - 크기가 N×M인 격자판의 각 칸에 정수가 하나씩 들어있다. 이 격자판에서 칸 K개를 선택할 것이고, 선택한 칸에 들어있는 수를 모두 더한 값의 최댓값을 구하려고 한다.
      단, 선택한 두 칸이 인접하면 안된다. r행 c열에 있는 칸을 (r, c)라고 했을 때, (r-1, c), (r+1, c), (r, c-1), (r, c+1)에 있는 칸이 인접한 칸이다.

헤걀 - 1. 완전탐색(dfs + 백트래킹)으로 풀어야 한다.
      2. go() 메서드를 통해 해당 원소의 주변 원소에 +1 해줘 방문할 수 없게 만든다.
      3. 결과값 담을 배열에 현재 값을 넣는다.
      4. 시작점+1 으로 재귀를 실행한다.
      5. 시작점이 선택개수(k)와 같으면 출력 후 백트래킹으로 원상 복구한다.
*/
class ex10 {
    public static int n;
    public static int m;
    public static int k;

    public static int[][] array; //행렬
    public static int[][] cal; //인접 확인

    public static int[] list;

    public static int max = -100000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        list = new int[k];

        cal = new int[n][m];
        array = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        dfs(0);

        System.out.println(max);

    }

    public static void dfs(int start) {

        if (start == k) { //시작숫자가 K개일때 최대값 넣기
            int temp = 0;
            for (int i : list) {
                temp += i;
            }
            max = Math.max(max, temp);
        } else {

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (cal[i][j] > 0) {
                        continue;
                    }
                    go(i, j);
                    list[start] = array[i][j]; //현재값 넣기
                    dfs(start+1);
                    back(i, j); //원상복귀
                }
            }

        }

    }

    public static void go(int x, int y) {
        cal[x][y]++; //현재값 +1
        if (y-1 >= 0) {
            //위가 존재할때
            cal[x][y-1]++;
        }
        if (x-1 >= 0) {
            //왼쪽이 존재할때
            cal[x-1][y]++;
        }
        if (y+1 < m) {
            //아래가 존재할때
            cal[x][y+1]++;
        }
        if (x+1 < n) {
            //오른쪽이 존재할때
            cal[x+1][y]++;
        }
    }

    public static void back(int x, int y) {
        cal[x][y]--;
        if (y - 1 >= 0) {
            cal[x][y-1]--;
        }
        if (x - 1 >= 0) {
            cal[x-1][y]--;
        }
        if (y + 1 < m) {
            cal[x][y+1]--;
        }
        if (x + 1 < n) {
            cal[x+1][y]--;
        }
    }
}
