package src.programmers.week4;
/*
문제 - 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
      요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

해결 - 1. day(요일), date(날짜) 배열을 선언한다.
      2. 입력받은 요일전까지 달에 날짜를 더한 후 sum 변수에 담는다.
      3. 요일 배열원소이므로 -1을 하고 7로 나눈 나머지가 요일이므로 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12901
*/
class week4_17 {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;

        for(int i=0; i<a-1; i++) {
            sum += date[i];
        }
        sum += b-1;
        int result = sum % 7;
        System.out.println(result);
        return day[result];
    }
}
