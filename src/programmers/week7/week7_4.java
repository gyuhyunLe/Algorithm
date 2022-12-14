package src.programmers.week7;
import java.util.*;
/*
문제
엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.

해결
1. 키패드 위아래로 3차이, 양옆으로 1차이인 것을 이용해서 아래와 같이 거리를 구한다.
2. tmp = 입력받은 값  left, right = 직전에 왼손과 오른손의 위치
3. leftdist, rightdist = 왼손과 입력받은 값의 거리, 오른손과 입력받은 값의 거리
*/
class week7_4 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left =10;
        int right =12;

        for(int tmp: numbers){
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp;
            }else if(tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp;
            }else {
                if(tmp==0) tmp=11;
                int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;

                if(leftdist<rightdist){
                    answer+="L";
                    left = tmp;
                }else if(leftdist>rightdist){
                    answer+="R";
                    right = tmp;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        left = tmp;
                    }else{
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }
}
