class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        int j =n-1;
        
        for(int i=0;i<n;i++){
            answer[i] = num_list[j];
                j-=1;
        }
        return answer;
    }
}