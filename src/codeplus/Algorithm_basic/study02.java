package src.codeplus.Algorithm_basic;
/*
문제 -  자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
       1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

해결 -  1. depth = 0 으로 넘겨줘 리턴하는 arr베열 원소에 i를 담는다.
       2. 방문 여부를 담는 배열 visit = false 이면 방문 안한 것이므로 depth = M 같을 떄 까지 arr 배열에 값을 담는다.
 */
import java.util.Scanner;
public class study02 {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}
