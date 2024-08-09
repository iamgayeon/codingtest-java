import java.util.*;

class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        int curr = 0;
        int index = 0;
        backtrack(0, 0, numbers, target);
        return answer;
    }
    
    public void backtrack(int curr, int index, int[] numbers, int target){
        if(index == numbers.length){
            if(curr == target){
                answer++;
            }
            
            return;
        }
        backtrack(curr+numbers[index], index+1, numbers, target);
        backtrack(curr-numbers[index], index+1, numbers, target);
    }
}