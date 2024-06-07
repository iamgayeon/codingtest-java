class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int count = 0;
        
        for(int i=0;i<cipher.length();i++){
            count += 1;
            if(count == code){
                answer += cipher.charAt(i);
                count = 0;
            }
        }
        return answer;
    }
}