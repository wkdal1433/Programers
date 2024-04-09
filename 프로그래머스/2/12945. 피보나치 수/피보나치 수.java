import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<Integer>();

    public Solution() {
    list.add(0);
    list.add(1);
    }
    public int solution(int n) {
        if (n<list.size()){
            return list.get(n)%1234567;
        }else {
            int ans = solution(n-1)+solution(n-2);
            list.add(ans);
            return ans%1234567;
        }
    }
}