class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if(hp >=5){
            answer += hp/5;
            hp  = hp - ((hp/5) *5);
        }
        if(hp >=3){
            answer += hp/3;
            hp  = hp - ((hp/3) *3);
        }
         if(hp >=1){
            answer += hp/1;
            hp  = hp - ((hp/1) *1);
        }
        return answer;
        
        
        
        
    }
}