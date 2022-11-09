package src.backjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
문제 - 첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
      둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.
      한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
      수열은 사전 순으로 증가하는 순서로 출력해야 한다.

헤걀 - 1. 오름차순 정렬한다.
      2. 자기 자신은 빼고 배열에 담아야 함으로 boolean 배열을 추가해줬다.
      3. dfs함수에 arr배열의 startIdx와 depth를 인자로 전달한다.
      4. 자기 자신은 빼고 출력할 배열에 담아야 하므로 boolean 배열인 visited에 방문 처리인 true를 해주고 dfs 재귀 호출을 한 뒤 다시 false처리를 해준다.
      5. 출력할 배열인 printArr에 depth값을 인덱스로 하여 arr[i]을 넣어준다.
      6. for문의 시작원소로 매개변수 전달 값으로 전달 받는다.
      7. dfs 재귀 호출을 할 때 startIdx에 i + 1을 넣어주고 depth 값에 depth + 1을 해준다.
*/
import java.util.*;
public class ex07 {
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

        dfs(0, 0);
    }

    public static void dfs(int startIdx, int depth) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(printArr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=startIdx; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                printArr[depth] = arr[i];
                dfs(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}
