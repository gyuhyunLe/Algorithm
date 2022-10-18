package src.programmers.week5;
/*
문제 - 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
       전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
        구조대 : 119
        박준영 : 97 674 223
        지영석 : 11 9552 4421
        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

해결 - 1. hashMap을 선언하여 배열 원소값을 put 한다.
      2. 이중 for문을 통해 배열 하나의 원소를 substring으로 구분하여 map에 담긴 값이랑 비교하여 값이 있으면 false를 리턴한다.

출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42577
*/
import java.util.*;
class week5_4 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i], 0);
        }

        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    System.out.println(map.get(phone_book[i]));
                    return false;
                }
            }
        }

        return true;
    }
}
