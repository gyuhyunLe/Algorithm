package src.programmers.week2;
/*
문제 - 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
      예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
      자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

해결 - 배열을 선언하여 string으로 형변환시킨 변수를 자릿수 마다 구분하여 담는다.
      다시 정수로 형변환 시켜 sum 변수에 담고, 입력받은 수로 나눠 나머지가 0일 경우 true를 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
class week2_5 {
    public boolean solution(int x) {
        String ins = Integer.toString(x);
        String[] sumarr = new String[ins.length()];
        int sum = 0;
        for(int i=0;i<ins.length(); i++) {
            sumarr[i] = ins.substring(i,i+1);
            sum += Integer.parseInt(sumarr[i]);
        }
        if(x%sum == 0){
            return true;
        }else {
            return false;
        }
    }
}
