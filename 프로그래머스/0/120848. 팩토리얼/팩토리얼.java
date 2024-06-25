class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=2;
        
        while(true){
            if(answer > n){
                break;
            }
            answer = answer * i;
            i++;
        }
        i=i-2;
        return i;
    }
}