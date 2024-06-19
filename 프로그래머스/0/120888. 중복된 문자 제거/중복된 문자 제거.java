import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        Set <Character> skip = new LinkedHashSet<>(); // LinkedHashSet은 순서보장
        
        for(char ch:my_string.toCharArray()){
            skip.add(ch);
        }
        
        StringBuilder result = new StringBuilder();
        for(char ch: skip){
            result.append(ch);
        }
        
        
        return result.toString();
    }
}