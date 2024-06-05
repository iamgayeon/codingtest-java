class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '1' && c <= '9') { // 문자 '1'부터 '9'까지의 범위를 확인
                answer += Character.getNumericValue(c); // 문자를 정수로 변환하여 더함
            }
        }
        return answer;
    }
}
