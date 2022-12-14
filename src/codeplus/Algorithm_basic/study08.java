package src.codeplus.Algorithm_basic;

import java.util.Arrays;
import java.util.Scanner;

/*
문제 - N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.
      N개의 자연수 중에서 M개를 고른 수열
      같은 수를 여러 번 골라도 된다.

해결 - 1. 오름차순 정렬한다.
      2. 자기 자신은 빼고 배열에 담아야 함으로 boolean 배열을 추가해줬다.
      3. dfs함수에 arr배열의 i+1인자와 depth를 인자로 전달한다.
      5. 출력할 배열인 printArr에 depth값을 인덱스로 하여 arr[i]을 넣어준다.
*/
class study08 {
    public static int N, M;
    public static int[] arr;
    public static int[] printArr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

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
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(printArr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            printArr[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}