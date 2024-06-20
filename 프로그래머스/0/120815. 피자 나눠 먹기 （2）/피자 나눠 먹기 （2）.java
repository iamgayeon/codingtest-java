class Solution {
    public int solution(int n) {
        int answer = 1;
        
        if(n% 6 == 0){
            answer = n /6;
        }
        if((n% 6 != 0)){
            for(int i=1; i<=n;i++){
                if((i * 6) % n == 0){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}