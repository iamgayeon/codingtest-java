class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int cnt[]=new int[200]; // 각 인덱스에 100을 더하면 200인 인덱스가 나오므로
        
        for(int i=0;i<3;i++){
            for(int j=lines[i][0];j<lines[i][1];j++){
                cnt[j+100]++; // 좌표가 음수인 값을 인덱스에 넣기 위해 100 더하기
            }
        }
        
        for(int i=0;i<200;i++){
            if(cnt[i] > 1)
                answer+=1;
        }
        
        
        return answer;
    }
}