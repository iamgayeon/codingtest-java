class Solution {
    public long solution(String numbers) {
        // 각 숫자 단어와 그에 대응하는 숫자를 정의
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        // 각 숫자 단어를 숫자로 대체
        for (int i = 0; i < eng.length; i++) {
            numbers = numbers.replace(eng[i], digits[i]);
        }
        
        // 숫자 문자열을 long 타입으로 변환하여 반환
        return Long.parseLong(numbers);
    }
}
