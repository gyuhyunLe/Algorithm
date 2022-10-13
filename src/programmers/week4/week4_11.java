package src.programmers.week4;
/*
문제 - 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
      지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
      전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
       "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
       암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

해결 - 1. toBinaryString (10진수 > 2진수) 변환한다.
      2. 이진수 변환시 지도 길이와 다를때 앞에 0을 붙여준다.
      3. 두 배열중에 하나라도 1이 포함되어 있으면 #을 출력하고 0을 포함하면 공백을 출력한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/17681
*/
class week4_11 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            String temp = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);

            String target = "";
            while(temp.length() < n) {
                temp = "0" + temp;
            }
            while(temp2.length() < n) {
                temp2 = "0" + temp2;
            }
            for(int j=0; j<n; j++) {
                if(temp.charAt(j) == '1' || temp2.charAt(j) == '1') {
                    target += "#";
                } else {
                    target += " ";
                }
            }
            answer[i] = target;
        }
        return answer;
    }
}
