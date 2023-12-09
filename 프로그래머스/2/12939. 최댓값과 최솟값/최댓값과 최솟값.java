class Solution {
    public String solution(String s) {
        int Max = -99999;
        int min = 99999;
        String[] numbers = s.split(" "); 
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if(num>Max) Max = num;
            if(num<min) min = num;
        } 
        String answer = min+" "+Max;
        return answer;
    }
}