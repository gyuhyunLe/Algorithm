package src.programmers.week6;
/*
문제 -   네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고,
        컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
        컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

해결 - 1. 자기 자신이 아니며 (i ≠ j)
      2. check 배열 i 위치의 값이 false이며 (check[i] == false)
      3. computer 배열의 값이 1인 것 (computer[i][j] == 0)

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43162
*/
class week6_6 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean check[] = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!check[i]) {
                dfs(computers,i,check);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;
        //자기 자신이 아니며 (i ≠ j)
        //check 배열 i 위치의 값이 false이며 (check[i] == false)
        //computer 배열의 값이 1인 것 (computer[i][j] == 0)
        for(int j=0; j<computers.length; j++) {
            if(i != j && computers[i][j] == 1 && check[j] == false) {
                dfs(computers,j,check);
            }
        }

    }
}