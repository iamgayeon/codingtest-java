import java.util.*;

class Solution {
    // Set을 클래스 변수로 변경
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        // 소수의 개수를 셀 변수
        int answer = 0;

        // 주어진 문자열 numbers에서 숫자 조합 생성
        permutation(numbers, 0, new boolean[numbers.length()], 0);

        // 각 숫자 조합이 소수인지 확인하여 소수라면 카운트 증가    
        for(int num : set){
            if(isPrime(num)) answer++;
        }

        return answer;
    }

    // 주어진 문자열에서 숫자 조합을 생성하는 재귀 함수
    // current 변수 -> 현재 생성 중인 숫자
    // digit 변수 -> 현재 생성 중인 숫자의 자릿수
    void permutation(String numbers, int current, boolean[] visited, int digit){
        // 모든 자릿수에 대해 숫자 조합을 생성했다면 종료
        if(digit == numbers.length()) return;

        for(int i = 0; i < numbers.length(); i++){
            // 이미 방문한 숫자는 건너뛰기
            if(visited[i]) continue;

            // 현재 숫자와 자릿수를 이용하여 새로운 값 생성
            int value = current * 10 + (numbers.charAt(i) - '0');

            // 값을 HashSet에 추가
            set.add(value);

            // 현재 숫자를 방문 처리
            visited[i] = true;
            permutation(numbers, value, visited, digit + 1);
            // 방문 처리 해제 (백트래킹)
            visited[i] = false;
        }
    }

    boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
