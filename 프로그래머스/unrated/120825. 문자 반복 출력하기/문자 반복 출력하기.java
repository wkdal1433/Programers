class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char temp;
        for(int i =0;i<my_string.length();i++){
            temp = my_string.charAt(i);
            for(int q=0;q<n;q++){
                answer+=temp;
            }
        }
        return answer;
    }
}