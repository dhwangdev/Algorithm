import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();
        for (String num: phone_book) {
            hm.put(num, 0);
        }

        for (int i=0; i<phone_book.length; i++) {
            for (int j=0; j<phone_book[i].length(); j++) {
                if (hm.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }
}
