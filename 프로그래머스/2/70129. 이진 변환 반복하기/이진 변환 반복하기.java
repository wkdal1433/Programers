import java.util.*;

class Solution {
    
    public int[] solution(String s) {
        int count;
        int zeroCount = 0;
        int loopCount =0;
        while (!Objects.equals(s, "1") && !Objects.equals(s, "0")){
            count = getCount(s);
//            System.out.println(count);
            zeroCount += s.length()-count;

            s = Integer.toBinaryString(count);
//            System.out.println(s);
            loopCount++;
//            System.out.println(loopCount);
        }

        return new int[]{loopCount,zeroCount};
    }

    private static int getCount(String s) {
        int count =0;
//        System.out.println(s.length());
        for(int i = 0; i<s.length(); i++){
            if( s.charAt(i)=='1'){
                count++;
//                System.out.println(count);
            }
        }
        return count;
    }
}