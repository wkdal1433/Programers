import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String ages = Integer.toString(age);
        for (int i = 0; i < ages.length(); i++) {
            int digit = Character.getNumericValue(ages.charAt(i));
            answer += alp[digit];
        }

        return answer;
    }
    
}