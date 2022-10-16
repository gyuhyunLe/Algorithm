package src.programmers.week5;
/*
문제 - 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다. N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때,
       N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.

해결 - 1. 배열 크기에서 반을 나누어 변수에 담는다.
      2. 오름차순 정렬 후 중복인 값을 제외한 나머지 값을 비교하여 answer 변수에 담아준다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/1845
*/
import java.util.*;
class week5_1 {
    public int solution(int[] nums) {
        int answer = 1;
        int count = nums.length/2;

        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if (answer < count) {
                if(nums[i] != nums[i-1])
                    answer++;
            }
        }
        return answer;
    }
}
