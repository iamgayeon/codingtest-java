class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            int num = l;
            while (num > 0) {
                if (num % 10 == k) {
                    answer += 1;
                }
                num /= 10; // 다음 자리수로 이동
            }
        }
        return answer;
    }
}
