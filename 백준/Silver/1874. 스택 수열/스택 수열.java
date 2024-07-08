import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        int start = 0;

        // n번 반복
        while (n-- > 0) {
            int number = sc.nextInt();
            if (number > start) {
                for (int i = start + 1; i <= number; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                // 이전에 어디까지 입력 받았는지를 알기 위해 변수 start를 number 값으로 초기화!
                // ex. 4까지 push를 했다면 다음에 push할 때 5부터 하기 위해서ㅓ
                start = number;
            }

            // top에 있는 원소가 입력 받은 값과 같지 않은 경우
            else if (stack.peek() != number) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb.toString());
    }
}