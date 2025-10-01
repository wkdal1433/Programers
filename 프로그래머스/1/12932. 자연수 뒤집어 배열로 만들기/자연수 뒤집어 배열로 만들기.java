class Solution {
    public int[] solution(long n) {
        String nn = "";
        nn += n;
        
        int[] answer = new int[nn.length()];
        
        for(int i=0; i<nn.length(); i++){
            answer[i] = Integer.parseInt(nn.charAt(nn.length()-i-1)+"");
        }
        return answer;
    }
}