package src.programmers.week4;
/*
문제 - 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
       하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
       모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

해결 - 1. 가로 길이와 세로 길이를 비교하여 가로값을 최대로 한다.
      2. 세로 길이중에 최대값과 가로 길이중에 최대값을 변수에 담는다.
      3. 최대값(가로*세로) 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/86491
*/
class week4_12 {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;
        for(int i=0; i<sizes.length; i++) {
            int temp = 0;
            if(sizes[i][0] < sizes[i][1]) { //가로 < 세로 일시 가로값 최대로
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(max_w < sizes[i][0]) max_w = sizes[i][0];
            if(max_h < sizes[i][1]) max_h = sizes[i][1];
        }

        return max_w * max_h;
    }
}
