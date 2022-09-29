package src.programmers.week2;
/*
문제 - 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.

해결 - 입력받은 정수를 형변환시켜 자릿수 만큼 나눈다.
       다시 정수로 형변환 시켜 더해준다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
class week2_1 {
    public int solution(int n) {
        int answer = 0;
        String ins = Integer.toString(n);

        for(int i=0; i<ins.length(); i++) {
            answer += Integer.parseInt(ins.substring(i,i+1));
        }
        System.out.println("answer");
        return answer;
    }
}
