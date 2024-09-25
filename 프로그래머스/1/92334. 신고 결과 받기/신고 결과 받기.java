import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 사용자가 신고한 유저를 저장할 Map
        Map<String, Set<String>> reportMap = new HashMap<>();
        // 각 유저가 신고당한 횟수를 저장할 Map
        Map<String, Integer> reportedCount = new HashMap<>();

        // 신고 처리
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0]; // 신고자
            String reported = parts[1]; // 신고당한 유저

            // 신고한 유저 목록을 초기화
            reportMap.putIfAbsent(reporter, new HashSet<>());
            // 중복 신고 방지
            reportMap.get(reporter).add(reported);
        }

        // 신고당한 유저 수 계산
        for (Set<String> reporters : reportMap.values()) {
            for (String reported : reporters) {
                reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
            }
        }

        // 결과 배열 생성
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String userId = id_list[i];
            // 신고당한 유저 수를 체크하고, 기준 이상인 경우 카운트
            if (reportMap.containsKey(userId)) {
                for (String reported : reportMap.get(userId)) {
                    if (reportedCount.getOrDefault(reported, 0) >= k) {
                        result[i]++;
                    }
                }
            }
        }

        return result; // 최종 결과 배열 반환
    }
}
