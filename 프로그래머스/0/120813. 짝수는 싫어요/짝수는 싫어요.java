class Solution {
    public int[] solution(int n) {
        int size= (n+1)/2;
        int[] answer = new int[size];
        int sum = 1;
        for(int i=0;sum<=n;i++){
            answer[i] = sum;
            sum +=2;
        }
        return answer;
    }
}