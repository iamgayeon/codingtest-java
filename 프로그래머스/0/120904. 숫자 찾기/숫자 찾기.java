class Solution {
    public int solution(int num, int k) {   
        int answer = -1;
        String s = Integer.toString(num);
        
        char check = (char) (k +'0');
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == check){
                answer = i+1;
                break;
            }
        }
        return answer;
        
    }
}