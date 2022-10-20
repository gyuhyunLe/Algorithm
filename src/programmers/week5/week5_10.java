package src.programmers.week5;
/*
문제 - 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

해결 - 1. 뒤에 배열 원소가 더 클 시 1을 입력 후 break 한다.
      2. 앞에 배열 원소가 더 클 시 반복해서 1을 더해준다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42584
*/
class week5_10 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                answer[i] += 1;
                if(prices[i] > prices[j]){
                    break;
                }
            }
        }
        return answer;
    }
}
