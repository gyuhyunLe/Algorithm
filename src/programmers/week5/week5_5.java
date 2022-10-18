package src.programmers.week5;
/*
문제 - 스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
        제한사항
        clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
        스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
        같은 이름을 가진 의상은 존재하지 않습니다.
        clothes의 모든 원소는 문자열로 이루어져 있습니다.
        모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
        스파이는 하루에 최소 한 개의 의상은 입습니다.

해결 - 1.headgear는 총 2개 있으니, 스파이에게는 총 3가지의 경우의 수가 있다.
        1번을 입는다.
        2번을 입는다.
        headgear를 아무것도 입지 않는다.
        eyewear는 총 1개 있으니, 스파이에게는 총 2가지의 경우의 수가 있다.
        1번을 입는다.
        eyewear를 입지 않는다.
        총 3 x 2 가지의 경우의 수 인 6가지가 존재하고, 이 중 한 가지는 headgear도 입지 않고 eyewear도 입지 않은 경우가 되기 때문에 이 경우를 제외하 5가지가 정답이 되게 된다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42578
*/
import java.util.*;
class week5_5 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int answer = 1;

        for(int i=0; i<clothes.length; i++){
            // 현재 의상의 종류가 존재하지 않으면 1개 넣고, 존재하면 +1
            if(map.get(clothes[i][1]) == null)  map.put(clothes[i][1], 1);
            else    map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }
        for(String keys : map.keySet())
            answer *= (map.get(keys) + 1);

        return answer-1;
    }
}
