package src.programmerskit;

import java.util.HashMap;

/*
전화번호 목록
 */
public class ex03 {
    public boolean solution(String[] phone_book) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i< phone_book.length; i++) {
            map.put(phone_book[i],0);
        }
        for(int i=0; i< phone_book.length; i++) {
            for(int j=0; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}
