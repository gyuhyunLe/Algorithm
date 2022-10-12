package src.programmers.week4;
/*
문제 - 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
       예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
       문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

해결 - 1. 대문자일 경우 > 'Z' 크거나 작거나 비교하여 증가수 만큼 더해준다.
      2. 소문자일 경우 > 'z' 크거나 작거나 비교하여 증가수 만큼 더해준다.
      3. 공백일 시 공백 더해준다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12926
*/
class week4_10 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if('A' <= ch && ch <= 'Z') { // 대문자일 경우
                if(ch + n > 'Z') {
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            }
            if('a' <= ch && ch <= 'z') { // 소문자일 경우
                if(ch + n > 'z') {
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            }
            if(ch == ' ') { // 공백일 경우
                answer += " ";
            }
        }
        return answer;
    }
}
