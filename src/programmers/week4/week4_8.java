package src.programmers.week4;
/*
문제 - 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
       각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

해결 - 1. 공백일 시 인덱스 0으로 초기화한다.
      2. 인덱스 짝수일 시 대문자로 바꾼다.
      3. 인덱스 홀수일 시 소문자로 바꾼다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12930
*/
class week4_8 {
    public String solution(String s) {
        String answer = "";
        String[] target = s.split("");
        int temp = 0;

        for(int i=0; i<target.length; i++) {
            if(target[i].equals(" ")){
                temp = 0;
            } else if(temp % 2 == 0) {
                target[i] = target[i].toUpperCase();
                temp++;
            } else {
                target[i] = target[i].toLowerCase();
                temp++;
            }
            answer += target[i];
        }

        return answer;
    }
}
