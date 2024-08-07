class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        int curr = 0;
        int index = 0;
        answer = 0;
        backtrack(curr, index, numbers, target);
        return answer;
    }

    public void backtrack(int curr, int index, int[]numbers, int target){
        if(index == numbers.length){
            if(curr == target){
                answer+=1;
            }
            return;
        }
        backtrack(curr + numbers[index], index + 1, numbers, target);
        backtrack(curr - numbers[index], index + 1, numbers, target);
    }
}