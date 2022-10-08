package src.programmers.week3;
import java.util.*;
/*
문제 - 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.

해결 - 입력받은 문자열을 배열에 담는다.
       sort로 오름차순 정렬 후 reverseOrder함수를 사용하여 역순으로 저장하고 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12917
*/
//Arrays.sort("",Comparator.reverseOrder());     //내림차순
//Arrays.sort("",Collections.reverseOrder());     //내림차순
class week3_15 {
    public String solution(String s) {
        String[] target = s.split("");
        Arrays.sort(target, Collections.reverseOrder());
        String answer = "";

        for(int i=0; i<target.length; i++) {
            answer += target[i];
        }

        return answer;
    }
}
