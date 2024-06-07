class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        
        for(int i=0;i<my_string.length();i++){
            if(arr[i] == letter.charAt(0)){
                continue;
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}