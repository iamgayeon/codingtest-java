public class Solution {

    // 최대공약수를 구하는 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 유한소수인지 판별하는 함수
    public static int solution(int a, int b) {
        // 분자와 분모의 최대공약수를 구함
        int commonGcd = gcd(a, b);
        
        // 기약분수로 만들기
        a /= commonGcd;
        b /= commonGcd;
        
        // 분모가 1이 될 때까지 2와 5로 나누어 보기
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        
        // 기약분수로 만든 후의 분모가 1인 경우는 유한소수
        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(solution(a, b)); // 예시: 2 출력

        a = 5;
        b = 25;
        System.out.println(solution(a, b)); // 예시: 1 출력
    }
}
