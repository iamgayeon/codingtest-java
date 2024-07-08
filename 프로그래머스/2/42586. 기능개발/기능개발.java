import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int[] state = new int[progresses.length]; // 개발 완료 되었는지 확인하는 상태값 저장소
        int count = 0;
        int allFinishCount = 0;

        // 임시 반복문
        for(int k = 0; k < 10; k++){
            int finishCount = 0;
            // System.out.println(k+" 실행 전 : " + Arrays.toString(progresses));
            // System.out.println(k+" 실행 전 : " + Arrays.toString(state));
            for(int i = 0; i < progresses.length; i++){
                progresses[i] += speeds[i];
                if(progresses[i] >= 100){
                    state[i] = 1; // 개발 완료
                    progresses[i] = Integer.MIN_VALUE;
                    finishCount++;
                }
            }

            // 배포 체크
            if(finishCount > 0) { // 배포가 가능할때
                allFinishCount += finishCount; // 실제 작업이 끝난 갯수!
                int deployCount = 0; // 배포가 가능한 숫자
                for(int i = 0; i < state.length; i++) {
                    if(state[i] == 0) { // 앞에 개발이 안된경우임으로 할꺼 없다!
                        break;
                    }
                    if(state[i] == 1) { // 배포 가능할때!!
                        deployCount++;
                        state[i] = 2; // 배포 완료!
                    }
                }
                // 실제 정답 내는곳
                if(deployCount > 0) {
                    answer[count++] = deployCount;
                }
            }
            // System.out.println(k+" 실행 후 : " + Arrays.toString(progresses) + "\n");
        }

        return Arrays.copyOf(answer, count+1);
    }
}