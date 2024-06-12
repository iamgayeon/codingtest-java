import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr); // Arrays.sort()를 사용하여 배열을 정렬합니다.
        
        int answer = 0;
        if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
            // Case 1: 모든 주사위 숫자가 같을 때
            answer = arr[0] * 1111;
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            // Case 3: 두 쌍의 주사위 숫자가 같을 때
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            // Case 2: 세 주사위 숫자가 같을 때
            answer = (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
        } else if (arr[1] == arr[2] && arr[2] == arr[3]) {
            // Case 2: 세 주사위 숫자가 같을 때
            answer = (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]);
        } else if (arr[0] == arr[1]) {
            // Case 4: 두 주사위 숫자가 같을 때
            answer = arr[2] * arr[3];
        } else if (arr[1] == arr[2]) {
            // Case 4: 두 주사위 숫자가 같을 때
            answer = arr[0] * arr[3];
        } else if (arr[2] == arr[3]) {
            // Case 4: 두 주사위 숫자가 같을 때
            answer = arr[0] * arr[1];
        } else {
            // Case 5: 모든 주사위 숫자가 다를 때
            answer = arr[0];
        }
        
        return answer;
    }
}
