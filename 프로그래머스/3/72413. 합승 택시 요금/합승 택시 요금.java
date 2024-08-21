import java.util.*;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 그래프를 인접 리스트로 표현
        Map<Integer, List<Edge>> graph = new HashMap<>();
        
        // 그래프 초기화
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // 엣지 정보를 그래프에 추가
        for (int[] fare : fares) {
            int u = fare[0];
            int v = fare[1];
            int w = fare[2];
            
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w)); // 무향 그래프이므로 양방향으로 추가
        }
        
        // 출발 지점에서 모든 노드까지의 최단 경로를 계산
        int[] distFromStart = dijkstra(n, graph, s);
        // 목적지 A까지의 최단 경로를 계산
        int[] distFromA = dijkstra(n, graph, a);
        // 목적지 B까지의 최단 경로를 계산
        int[] distFromB = dijkstra(n, graph, b);

        // 최적의 요금을 찾기 위한 초기값 설정
        int minFare = Integer.MAX_VALUE;
        
        // 모든 노드에서의 합승 요금 계산
        for (int i = 1; i <= n; i++) {
            // 출발 지점에서 노드 i까지 가는 비용 + 노드 i에서 A까지 가는 비용 + 노드 i에서 B까지 가는 비용
            int fare = distFromStart[i] + distFromA[i] + distFromB[i];
            minFare = Math.min(minFare, fare);
        }
        
        // 최소 요금을 반환
        return minFare;
    }

    // 다익스트라 알고리즘을 사용하여 최단 경로를 계산하는 메서드
    private int[] dijkstra(int n, Map<Integer, List<Edge>> graph, int start) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        // 우선순위 큐를 사용하여 현재 노드와 거리를 저장
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        pq.add(new Edge(start, 0));
        
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int node = current.node;
            int cost = current.cost;
            
            // 현재 노드까지의 비용이 기록된 비용보다 크면 무시
            if (cost > dist[node]) continue;
            
            // 현재 노드와 연결된 모든 엣지에 대해 검사
            if (graph.containsKey(node)) {
                for (Edge next : graph.get(node)) {
                    int nextNode = next.node;
                    int newCost = cost + next.cost;
                    
                    // 새로운 비용이 더 작으면 업데이트하고 큐에 추가
                    if (newCost < dist[nextNode]) {
                        dist[nextNode] = newCost;
                        pq.add(new Edge(nextNode, newCost));
                    }
                }
            }
        }
        
        return dist;
    }

    // 엣지를 표현하는 클래스
    class Edge {
        int node; // 도착 노드
        int cost; // 비용
        
        // 생성자
        public Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}
