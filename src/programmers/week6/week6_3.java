package src.programmers.week6;
/*
문제 -   고속도로를 이동하는 모든 차량이 고속도로를 이용하면서 단속용 카메라를 한 번은 만나도록 카메라를 설치하려고 합니다.
        고속도로를 이동하는 차량의 경로 routes가 매개변수로 주어질 때, 모든 차량이 한 번은 단속용 카메라를 만나도록 하려면 최소 몇 대의 카메라를 설치해야 하는지를 return 하도록 solution 함수를 완성하세요.

해결 - 1. 다차원 배열 오름차순 정렬한다.
      2. 나간 지점부터 answer 변수 증가 시작한다.
      3. 그 다음 진입 시점이 나간 지점보다 클 시 answer 변수 증가한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42883
*/
import java.util.*;
class week6_3 {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, (a,b) -> a[1] - b[1]); //다차원 배열 오름차순(나간 시점이 두번째 숫자)
        int location = routes[0][1];

        for(int i=1; i<routes.length; i++) {
            if(routes[i][0] > location) {
                answer++;
                location = routes[i][1];
            }
        }

        return answer;
    }
}
