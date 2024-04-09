class Solution {
        public int solution(int n) {
        int answer;
        int countOne = 0;
        String binaryString = Integer.toBinaryString(n);

        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i)=='1'){
                countOne++;
            }
        }

        while(correctn(n+1, countOne)){
            n++;
        }
        answer = n+1;

        return answer;
    }

    private boolean correctn(int n, int countOne) {
        String binaryString = Integer.toBinaryString(n);
        int newcountOne = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i)=='1'){
                newcountOne++;
            }
        }
        if (newcountOne == countOne){
            return false;
        }
        return true;
    }
}
