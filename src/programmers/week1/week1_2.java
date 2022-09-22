package src.programmers.week1;

/*
문제 - 2022 KAKAO TECH INTERNSHIP
      성격 유형 검사하기

해결 - 지표 변수 4개를 선언한다.
      choices에 따라 score 변수에 추가한다.
      지표를 담는 survey 배열을 비교하여 유형을 출력할 변수에 score 변수에 추가한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */

public class week1_2 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int score_RT = 0;
        int score_CF = 0;
        int score_JM = 0;
        int score_AN = 0;

        for(int i=0; i<survey.length; i++) {
            String sur = survey[i];
            int score = 0;

            switch(choices[i]) {
                case 1 : score = -3; break;
                case 2 : score = -2; break;
                case 3 : score = -1; break;
                case 4 : score = 0;  break;
                case 5 : score = 1;  break;
                case 6 : score = 2;  break;
                case 7 : score = 3;  break;
            }
            switch(sur) {
                case "RT" : score_RT += score; break;
                case "TR" : score_RT -= score; break;
                case "CF" : score_CF += score; break;
                case "FC" : score_CF -= score; break;
                case "JM" : score_JM += score; break;
                case "MJ" : score_JM -= score; break;
                case "AN" : score_AN += score; break;
                case "NA" : score_AN -= score; break;
            }
        }
        String usrsur1 = "R";
        String usrsur2 = "C";
        String usrsur3 = "J";
        String usrsur4 = "A";

        if(score_RT > 0) usrsur1 = "T";
        if(score_CF > 0) usrsur2 = "F";
        if(score_JM > 0) usrsur3 = "M";
        if(score_AN > 0) usrsur4 = "N";

        answer = usrsur1 + usrsur2 + usrsur3 + usrsur4;
        return answer;
    }
}
