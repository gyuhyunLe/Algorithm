package src.programmers.week6;
/*
문제 -   무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
        예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
        구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
        사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

해결 - 1. 오름차순 정렬 후 가장 적게 나가는 사람 + 가장 많이 나가는 사람 순으로 limit 값과 비교한다.
      2. 처음/마지막 인덱스 합이 limit 작거나 같을 시 처음 인덱스는 증가 마지막 인덱스는 감소하면서 반복 실행하여 answer 변수에 담는다.
      3. 두명의 무게가 limit 보다 클 시는 한사람만 탑승 가능하므로 제일 많이 나가는 사람 순으로 answer 변수에 담는다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42883
*/
import java.util.*;
class week6_2 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;

        while(start <= end) {   //2명씩 탑승
            if(people[start] + people[end] <= limit) {
                answer++;
                start++;
                end--;
            } else {    //가장무거운 사람한명만 탑승
                answer++;
                end--;
            }
        }
        return answer;
    }
}
