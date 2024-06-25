class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;
        for(int i=0; i <answer.length;i++){
            int[] tmp = new int[n];
            for(int k=0;k<n;k++){
                tmp[k] = num_list[index];
                index ++;
            }
            answer[i] = tmp;
        }
        return answer;
    }
}