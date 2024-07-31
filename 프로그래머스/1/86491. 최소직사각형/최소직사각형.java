class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int final_w = 0;
        int final_h = 0;
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            final_w = Math.max(final_w, w);
            final_h = Math.max(final_h, h);
                
        }
        
        answer = final_w * final_h;
        return answer;
    }
}