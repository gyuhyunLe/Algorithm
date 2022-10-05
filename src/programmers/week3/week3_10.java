package src.programmers.week3;
/*
문제 - 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
       실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

해결 - signs 배열을 조건에 담아서 참일경우 더해주고 아닐경우 마이너스 한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/76501
*/
class week3_10 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length; i++){
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
