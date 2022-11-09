package src.codeplus.Algorithm_basic;
/*
문제 - 첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
      둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.
      한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
      수열은 사전 순으로 증가하는 순서로 출력해야 한다.

헤걀 - 1. 오름차순 정렬한다.
      2. 자기 자신은 빼고 배열에 담아야 함으로 boolean 배열을 추가해줬다.
      3.
*/
import java.util.*;

public class study06 {
    public static int N, M;
    public static int[] arr;
    public static int[] printArr;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N]; // 입력받은 배열
        printArr = new int[N]; // 출력할 배열
        visit = new boolean[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        dfs( 0);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(printArr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                printArr[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
