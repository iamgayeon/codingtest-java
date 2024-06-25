import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] s = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            String current = babbling[i];
            for(String word : s) {
                current = current.replace(word, "1");
            }
            // "1" 이외의 다른 문자가 있는지 확인
            if (current.replace("1", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
