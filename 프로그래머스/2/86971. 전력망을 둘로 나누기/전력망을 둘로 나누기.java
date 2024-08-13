// 전력망 네트워크가 두 개로 나뉘는데 개수가 최대한 비슷하게 나눔
// 총 9개 일 때는 4, 5 / 3, 6개 정도로 나누면 적당함
// 두 개의 절대값 구하기
// 시간복잡도: n * O(n) = n^2
// tree의 특징과 dfs를 이용하자
// 원래 트리라면 방향성있어야 하지만, 트리이긴 하지만 방향은 없음
// 어디가 루트인 지 모름.. 아무나 잡고 올려도 루트 노트가 되고 트리가 된다
// 각 노드마다 서브트리가 몇 개인 지 알아내야 함
// 어딜 잘라야 균등하게 나눌 수 있을 지.. -> 그걸 어떻게 자를지?
// 내 밑에 몇 개가 있는지에 따라서
// 한 번의 DFS만으로 하나하나 잘랐을 때 결과를 알아볼 수 있음

import java.util.*;

class Solution{
	int answer;
	boolean[] visited;
	Map<Integer, List<Integer>> graph;
	public int solution(int n, int[][] wires){
			answer = n;
			visited = new boolean[n+1];
			graph = new HashMap<>();
			
			// 그래프
			for(int i=1; i<=n; i++){
					graph.put(i, new ArrayList<>());
			}
			
			for(int[] wire : wires){
					int u = wire[0];
					int v = wire[1];
					graph.get(u).add(v);
					graph.get(v).add(u);
			}
			
			dfs(graph, visited, 1, n);
			
			return answer;
	}
			
	int dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int cur, int n){
			int count = 1;
			visited[cur] = true;
			for(int next : graph.get(cur)) {
					if(!visited[next]){
							count += dfs(graph, visited, next, n);
					}
			}
			answer = Math.min(answer, Math.abs(n - count * 2));  // 11-3 - 3 -> 11 - 2 * 3
        // n - count - count
			
			return count;
		}
}
			