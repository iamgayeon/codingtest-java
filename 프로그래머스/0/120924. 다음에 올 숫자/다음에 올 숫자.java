class Solution {
    public int solution(int[] common) {
        int answer = 0;

        // 등비수열인지 확인
        if (common[0] != 0 && common[1] % common[0] == 0 && common[2] % common[1] == 0) {
            int ratio = common[1] / common[0];
            if (common[2] / common[1] == ratio) {
                // 등비수열의 다음 항을 계산
                answer = common[common.length - 1] * ratio;
            }
        }
        // 등차수열인지 확인
        else if (common[2] - common[1] == common[1] - common[0]) {
            int difference = common[1] - common[0];
            // 등차수열의 다음 항을 계산
            answer = common[common.length - 1] + difference;
        }

        return answer;
    }
}
