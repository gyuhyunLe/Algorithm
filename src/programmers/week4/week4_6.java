package src.programmers.week4;
/*
문제 - 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
      이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

해결 - 3진법으로 변환(3으로 나눈 나머지를 첫번째위치부터 나열) 후에 문자열은 10진법으로 다시 변환한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/68935
*/
class week4_6 {
    public int solution(int n) {
        String answer = "";
        while(n!=0){
            answer += n%3;
            n /= 3;
        }
        return Integer.parseInt(answer,3); //3진법 > 10진법
    }
}
