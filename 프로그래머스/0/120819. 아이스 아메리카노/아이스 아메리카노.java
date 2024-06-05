class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int cnt = money / 5500;
        int result = money - 5500 * cnt;
        answer[0] = cnt;
        answer[1] = result;
        
        return answer;
    }
}