import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i =my_string.length()-1;0<=i;i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}