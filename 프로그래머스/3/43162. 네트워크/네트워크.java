class Solution {
    static int answer;
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n+1];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(n, computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int n, int[][] computers, boolean[] visited, int i){
        visited[i] = true;
        for(int j=0; j<n; j++){
            if(!visited[j]){
                if(computers[i][j] == 1){
                    dfs(n, computers, visited, j);
                }
            }
        }
    }
}