import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int[] state = new int[progresses.length]; // 0 = 개발중, 1=배포가능, 2=배포 끝
        int count = 0;
        int allFinishCount = 0; // 작업이 끝난 숫자

        // 임시 반복문 초기에는 for문 나중에는 while로 바꿔 break 지점을 정한다.
//		for(int k = 0; k < 10; k++) {
        while(true){
            int finishCount = 0; // flag 변수, 0이 아닌경우 배포가 될수 있다는 숫자
            // 초기에 Round를 돌리는 부
            for(int i = 0; i <progresses.length; i++) {
                progresses[i] += speeds[i]; // 증감부!!
                // 개발이 끝나서 배포 가능한지 체크하는 if문
                if(progresses[i] >= 100) { // state 업데이트!
                    state[i] = 1;
                    progresses[i] = Integer.MIN_VALUE; // 최소값으로 초기화, 이후에는 100 이상이 될일이 없다!
                    finishCount++; // 배포 가능여부 업데이트!
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
            // finish 여부 체크 -> 앞에할지 뒤에들어갈지 모른다!
            if(allFinishCount == progresses.length) {
                break;
            }
        }
        return Arrays.copyOf(answer, count);
    }
}