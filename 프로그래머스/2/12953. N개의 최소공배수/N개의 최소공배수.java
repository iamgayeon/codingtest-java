public class Solution {

    // 최대공약수(GCD)를 구하는 메서드
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 두 수의 최소공배수(LCM)를 구하는 메서드
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 배열의 모든 수에 대한 최소공배수(LCM)를 구하는 메서드
    public static int solution(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }
}