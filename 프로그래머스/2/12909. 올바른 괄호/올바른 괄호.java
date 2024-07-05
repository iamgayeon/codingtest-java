import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false; // 올바르지 않은 괄호 쌍 발견
                }
            }
        }
        
        return stack.isEmpty(); // 스택이 비어 있어야 올바른 괄호 쌍임
    }
}