package src.programmers.week4;
/*
문제 - 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
      각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
      예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

해결 - 1. 배열을 선언하여 배열원소 문자 n번째 값을 뽑아서 변수에 담는다.
      2. 배열을 오름차순 정렬한다.
      3. 정렬된 배열을 맨앞 문자를 제외한 나머지 원소를 담아 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12915
*/
import java.util.*;
class week4_13 {
    public String[] solution(String[] strings, int n) {
        String[] target = new String[strings.length];
        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length; i++) {
            String temp = strings[i].charAt(n) + strings[i];
            target[i] = temp;
        }
        Arrays.sort(target);
        for(int i=0; i<target.length; i++) {
            answer[i] = target[i].substring(1);
        }

        return answer;
    }
}
