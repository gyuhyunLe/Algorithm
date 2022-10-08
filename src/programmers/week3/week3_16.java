package src.programmers.week3;
import java.util.*;
/*
문제 - 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
       예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

해결 - charAt 함수를 이용하여 입력받은 문자열에 문자가 있을 시 false 리턴, 숫자로만 있을 시 true 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12918
*/
class week3_16 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
