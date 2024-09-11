import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 의상 종류별로 개수를 세기 위한 맵
        Map<String, Integer> map = new HashMap<>();
        
        // 의상 배열을 순회하며 의상 종류별 개수를 셈
        for (String[] cloth : clothes) {
            String type = cloth[1]; // 의상 종류
            map.put(type, map.getOrDefault(type, 0) + 1); // 맵에 의상 종류와 개수 추가
        }
        
        int answer = 1; // 결과를 저장할 변수, 조합 계산을 위해 1로 초기화
        
        // 각 의상 종류별로 조합 가능한 경우의 수를 계산
        for (int count : map.values()) {
            answer *= (count + 1); // 각 의상 종류에서 선택하거나 선택하지 않는 경우의 수
        }
        
        // 아무것도 입지 않는 경우를 제외하기 위해 1을 뺀다
        return answer - 1;
    }
}
