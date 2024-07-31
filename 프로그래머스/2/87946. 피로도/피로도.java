
class Solution {
    boolean[] visited; // 방문 처리
    int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        int n = dungeons.length;
        visited = new boolean[n]; // 방문 처리
        backtrack(k, dungeons, 0); // k -> 현재 피로도
    
        return answer;
    }
    
    void backtrack(int current, int[][] dungeons, int cnt){
        if(answer < cnt){
            answer = cnt;
        }
        for(int i=0; i<dungeons.length; i++){
            if(current >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                backtrack(current-dungeons[i][1], dungeons, cnt+1);
                visited[i] = false;
                
            }
        }
    }
    
}