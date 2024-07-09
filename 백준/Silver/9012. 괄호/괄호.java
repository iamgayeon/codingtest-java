import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (isVaildParentheses(s)) { // 유효한 괄호쌍인지 확인
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isVaildParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);

            if (ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                if (stack.isEmpty()) { //  스택이 비어있으면 유효하지 않음
                    return false;
                } else { // 스택의 최상단의 '(' 제거
                    stack.pop();
                }
            }
        }
        // 마지막에 스택이 비어있으면 유효한 괄호쌍
        return stack.isEmpty();
    }
}
