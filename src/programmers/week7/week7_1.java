package src.programmers.week7;
/*
문제 - 출발지점부터 도착지점까지의 거리 distance, 바위들이 있는 위치를 담은 배열 rocks,
      제거할 바위의 수 n이 매개변수로 주어질 때, 바위를 n개 제거한 뒤 각 지점 사이의 거리의 최솟값 중에 가장 큰 값을 return 하도록 solution 함수를 작성해주세요.

해결 - 1. mid값을 구한다.
      2. left / right 값을 비교한다.
      3. n개보다 돌을 더 많이 지웠다면 right(도착지점)을 mid - 1로 설정한다.
      4. n개보다 돌을 더 적게 지우거나 같게 지웠다면, answer = mid를 넣고 left를 mid + 1로 설정한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43236
*/
import java.util.*;
class week7_1 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int left = 0, right = distance;

        Arrays.sort(rocks);
        while(left <= right) {
            int mid = (left + right) / 2;
            int removeRocks = 0;
            int prev = 0;

            for(int i = 0; i < rocks.length; i++) {
                if (rocks[i] - prev < mid)
                    removeRocks++;
                else
                    prev = rocks[i];
            }
            if(distance - rocks[rocks.length-1] < mid)
                removeRocks++;
            if(removeRocks <= n) {
                answer = mid;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return answer;

    }
}
