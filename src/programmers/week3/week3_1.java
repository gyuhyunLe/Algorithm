package src.programmers.week3;
/*
문제 - 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.

해결 - 숫자를 배열에 담고 배열 내에서 숫자별로 크기를 비교한 후 내림차순 시킨다.
      다시 문자열에 담아 형변환시켜 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
class week3_1 {
    public long solution(long n) {
        String answer = "";
        String ins = Long.toString(n);
        int[] insarr = new int[ins.length()];
        int temp = 0;
        for(int i=0; i<ins.length(); i++) {
            insarr[i] = Integer.parseInt(ins.substring(i,i+1));
        }
        for(int i=0; i<ins.length(); i++){
            for(int j=i+1; j<ins.length(); j++) {
                if(insarr[i] < insarr[j]){
                    temp = insarr[i];
                    insarr[i] = insarr[j];
                    insarr[j] = temp;
                }
            }
        }
        for(int i=0; i<ins.length(); i++) {
            answer += insarr[i];
        }
        return Long.parseLong(answer);
    }
}
