class Solution {
    public String solution(int age) {
        String answer = "";
        String s = Integer.toString(age);
        
        for(int i=0;i<s.length();i++){
            char c = (char)(s.charAt(i) -'0'+ 97);
            answer += c;
        }
        
        return answer;
    }
}