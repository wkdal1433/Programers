import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        String c = "";
        int loop = a.length();
        for(int i=0; i<loop; i++){
            b = String.valueOf(a.charAt(i));
            if(Character.isUpperCase(a.charAt(i))){
                c +=b.toLowerCase();
            }else{
                c +=b.toUpperCase();
            }
        }
        System.out.print(c);
        
    }
}