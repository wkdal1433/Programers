class Solution {
        public int solution(int n) {
        int answer = 0;

        //2n으로 나눈 나머지가 n
        //2n-1로 나눈 몫이 n 이상, 나머지는 0

        for (int i = 1; i < n+1; i++) {
            int v=0;
            for (int j = i; j < n+1; j++) {
                v+=j;
                if(v == n){
                    answer ++;
                    break;
                } else if (v>n) {
                    break;
                }
            }
        }
        



        return answer;

    }

}