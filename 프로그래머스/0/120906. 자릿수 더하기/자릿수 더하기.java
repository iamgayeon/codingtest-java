class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true){
            if( n> 0){
                answer = answer + (n%10);
                n = n/10;

            }else
                break;
        }
        return answer;
    }
}