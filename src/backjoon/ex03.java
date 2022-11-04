package src.backjoon;
/*
문제 -  자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
       1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

해결 -  1. 현재 i 값보다 다음 재귀에서 더 커야하므로
		  i + 1 의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출해준다
       2. 중복 방문인지를 고려할 필요가 없으므로 boolean 배열로 중복 여부를 체크할 필요 또한 없다.
 */
import java.util.*;
public class ex03 {
    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(1, 0);
    }

    public static void dfs(int count, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = count; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
