import java.util.*;


class Solution {
    int answer;
    public int solution(String s) {
        answer = 0;
        String sb = s + s;
        for(int i =0; i< s.length(); i++){
            if(isValid(sb.substring(i, s.length() + i))) answer++;
        }
        return answer;
    }
    
    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char current : s.toCharArray()){
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }else {
                if(stack.isEmpty()) return false;
                
                char target = stack.pop();
                if((target == '(' && current != ')') ||
                   (target == '[' && current != ']') ||
                   (target == '{' && current != '}')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}