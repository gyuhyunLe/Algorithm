package src.Baekjoon.Codeplus.Basic;
/*
문제 - 암호는 서로 다른 L개의 알파벳 소문자들로 구성되며 최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성되어 있다고 알려져 있다. 또한 정렬된 문자열을 선호하는 조교들의 성향으로 미루어 보아 암호를 이루는 알파벳이 암호에서 증가하는 순서로 배열되었을 것이라고 추측된다. 즉, abc는 가능성이 있는 암호이지만 bac는 그렇지 않다.
     새 보안 시스템에서 조교들이 암호로 사용했을 법한 문자의 종류는 C가지가 있다고 한다. 이 알파벳을 입수한 민식, 영식 형제는 조교들의 방에 침투하기 위해 암호를 추측해 보려고 한다. C개의 문자들이 모두 주어졌을 때, 가능성 있는 암호들을 모두 구하는 프로그램을 작성하시오.

해결 - 1. 오름차순 되어야 하며 한개의 모음 + 두개의 자음으로 구성되어야 한다.
      2. 모음/자음 구분하여 카운트 변수를 증가해준다.
      3. 알파벳 시작하는 다음 startIdx 변수로 for문 반복한다.
*/
import java.util.Arrays;
import java.util.Scanner;

class Ex_1759 {
    static char[] arr;
    static boolean[] visit;
    static int l;
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        c = sc.nextInt();
        arr = new char[l];
        visit = new boolean[c];
        for(int i=0;i<c;i++) {
            arr[i] = sc.next().charAt(0);
        }
        Arrays.sort(arr);
        dfs(0,0);
    }

    public static void dfs(int startIdx, int depth) {
        StringBuilder sb = new StringBuilder();
        if(depth == l) {
            int alpha_ja = 0;   //자음 갯수
            int alpha_mo = 0;   //모음 갯수

            for(int i=0; i<c; i++) {
                if(visit[i]) {
                    sb.append(arr[i]);
                    if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                            arr[i] == 'o' || arr[i] == 'u') {
                        alpha_mo++;
                    } else {
                        alpha_ja++;
                    }
                }
            }
            //모음 한개이상 + 자음 두개이상
            if(alpha_mo >= 1 && alpha_ja >= 2) {
                System.out.println(sb);
            }
            for(int i=startIdx; i<c; i++) {
                visit[i] = true;
                dfs(i+1,depth+1);
                visit[i] = false;
            }
        }
    }
}
