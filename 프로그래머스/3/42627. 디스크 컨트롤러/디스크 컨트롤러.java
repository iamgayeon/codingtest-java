import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 작업 요청을 도착 시간 기준으로 정렬
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        
        // 현재 시각, 총 대기 시간, 인덱스를 초기화
        int currentTime = 0;
        int totalWaitingTime = 0;
        int index = 0;
        
        // 우선순위 큐를 사용하여 처리 시간이 짧은 작업을 우선 처리
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        
        while (index < jobs.length || !pq.isEmpty()) {
            // 현재 시각까지 도착한 작업들을 큐에 추가
            while (index < jobs.length && jobs[index][0] <= currentTime) {
                pq.offer(jobs[index++]);
            }
            
            // 큐가 비어있지 않으면 작업을 처리
            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1]; // 작업 처리
                totalWaitingTime += (currentTime - job[0]); // 대기 시간 계산
            } else {
                // 큐가 비어있으면 다음 작업의 도착 시간으로 시각 이동
                currentTime = jobs[index][0];
            }
        }
        
        // 평균 대기 시간 반환
        return totalWaitingTime / jobs.length;
    }
}
