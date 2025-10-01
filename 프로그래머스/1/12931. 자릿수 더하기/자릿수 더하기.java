import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nn = "";
        nn += n;
        for(int i =0; i<nn.length(); i++){
            answer += Integer.parseInt(nn.charAt(i)+"");
            
            System.out.println(nn.charAt(i));
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("answer");

        return answer;
    }
}