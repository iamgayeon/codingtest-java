class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int max = 0;
        
        for(int i=0;i<2;i++){
            if(sides[i] > sides[i+1]){
                max = sides[i];
                sides[i] = sides[i+1];
                sides[i+1] = max;    
            }
        }
        if(sides[0] + sides[1] <= sides[2]){
            answer =2;
        }
        
        return answer;
    }
}