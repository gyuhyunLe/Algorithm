package src.programmers.week5;
/*
문제 - 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
       마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요

해결 - 1. 두 배열을 오름차순 정렬시킨다.
      2. 완주자 배열 크기만큼 for문 반복하여 참여자 배열의 원소와 비교한다.
      3. 비교했을 때 같지 않는 원소면 리턴하고 마지막 원소일 경우 참여자 마지막 원소를 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42576
*/
import java.util.*;
class week5_2 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i=0; i<completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}

