package src.programmers.week3;
/*
문제 - 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

해결 - 입력받은 길이를 구하여 짝수/홀수 분기 처리 후 substring 으로 문자를 가져와 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12903
*/
class week3_12 {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;

        if(s.length() % 2 == 0) {
            answer = s.substring(mid-1,mid+1);
        }else{
            answer = s.substring(mid,mid+1);
        }
        return answer;
    }
}
