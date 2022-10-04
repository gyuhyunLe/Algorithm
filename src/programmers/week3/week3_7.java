package src.programmers.week3;
/*
문제 - 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
       전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

해결 - 뒷자리 4자리 제외한 자릿수를 * 문자로 for문 반복을 통하여 변수에 저장한다.
       저장한 변수에 나머지 4자리 수를 합쳐 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12948
*/
class week3_7 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}
