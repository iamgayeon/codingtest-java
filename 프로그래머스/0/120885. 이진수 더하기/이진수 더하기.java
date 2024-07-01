// parseInt(String 문자열, int 진수) 을 넣어주면 진수인 문자열 값을 10진수 int타입으로 반환!
// toBinaryString(int i): 10진수 → 2진수로 바꾸어 String 타입으로 반환

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        return answer;
    }
}