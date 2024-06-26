class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수의 분모의 최소공배수(LCM)를 구합니다.
        int lcm = lcm(denom1, denom2);

        // 각 분수를 최소공배수에 맞춰 분모를 변경하고 분자를 조정합니다.
        numer1 *= (lcm / denom1);
        numer2 *= (lcm / denom2);

        // 두 분수를 더합니다.
        int numerSum = numer1 + numer2;

        // 결과 분수를 기약 분수로 만들기 위해 최대공약수(GCD)를 구합니다.
        int gcd = gcd(numerSum, lcm);

        // 분자와 분모를 최대공약수로 나누어 기약 분수로 만듭니다.
        int[] answer = {numerSum / gcd, lcm / gcd};

        return answer;
    }

    // 최대공약수(GCD)를 구하는 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM)를 구하는 메서드
    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
