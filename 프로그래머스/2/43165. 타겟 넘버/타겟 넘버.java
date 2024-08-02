class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
         backtrack(0, 0, numbers, target);
        return answer;
    }
    
    void backtrack(int cur, int index, int[] numbers, int target){
        
        if(index == numbers.length){
            if(cur == target){
                answer+=1;
            }
            return;
        }

        backtrack(cur + numbers[index], index+1, numbers, target);
        backtrack(cur - numbers[index], index+1, numbers, target);
    }
}