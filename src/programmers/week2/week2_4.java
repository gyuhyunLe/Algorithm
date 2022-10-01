package src.programmers.week2;
/*
문제 - 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
      'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

해결 - p/P/y/Y 일시 cnt 값을 이용해 갯수가 같으면 0인 경우를 조건에 포함한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
class week2_4 {
    boolean solution(String s) {
        int cnt = 0;
        for(int i=0;i<s.length(); i++) {
            if(s.substring(i,i+1).equals("P") || s.substring(i,i+1).equals("p")){
                cnt++;
            }else if(s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y")){
                cnt--;
            }
        }
        if(cnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
