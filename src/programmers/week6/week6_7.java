package src.programmers.week6;
/*
문제 - 두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.
      1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
      2. words에 있는 단어로만 변환할 수 있습니다.
      예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.
      두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

해결 - 1. 한 글자 빼고 나머지 같은 단어 찾는다.
      2. 찾은 단어를 visited=true 한다.
      3. cnt를 증가시키면서 dfs 재귀호출한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43163
*/
class week6_7 {
    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }
            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
