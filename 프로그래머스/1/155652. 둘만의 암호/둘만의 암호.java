import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        String answer ="";
        Set <Character> skipSet = new HashSet<>();
        
        for(char ch : skip.toCharArray()){
            skipSet.add(ch);
        }
        
        for(char ch : s.toCharArray()){
            int count = index;
            while(count > 0){
                ch++;
            if(ch > 'z'){
                ch = 'a';
            }
            if(!skipSet.contains(ch)){
                count --;
            }
        }
        answer += ch;
        }
       
         return answer;
    }
}
