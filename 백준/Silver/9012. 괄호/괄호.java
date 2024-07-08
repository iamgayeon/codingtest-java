import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (isVaildParentheses(s)) {
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
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
