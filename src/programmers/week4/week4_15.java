package src.programmers.week4;
/*
문제 - 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
        1478 → "one4seveneight"
        234567 → "23four5six7"
        10203 → "1zerotwozero3"
        이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

해결 - 1. 알파벳만을 담은 배열을 선언한다.
      2. replace함수를 사용하여 i=0 부터 9까지 해당 알파벳 배열과 일치시킨다.
      3. String이므로 int로 형변환 시켜 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/81301
*/
class week4_15 {
    public int solution(String s) {
        int answer = 0;
        String[] alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<=9; i++) {
            s = s.replace(alpha[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
