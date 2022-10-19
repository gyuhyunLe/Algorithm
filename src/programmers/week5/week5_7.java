package src.programmers.week5;
/*
문제 - 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
       "()()" 또는 "(())()" 는 올바른 괄호입니다.
       ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
       '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

해결 - 1. ( / ) 갯수가 같으면 true 리턴 <-> 다르면 false 리턴한다.
      2.  ( 가 더 많을 시는 for문 후에 false 리턴 <-> ) 가 더 많을 시는 바로 false 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12909
*/
class week5_7 {
    boolean solution(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if(s.charAt(i) == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
