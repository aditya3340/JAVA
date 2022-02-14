package LeetCode;
//https://leetcode.com/problems/find-the-difference
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        int s_sum = 0 ;
        for (int i = 0; i < t.length(); i++) {
            s_sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            s_sum -= s.charAt(i);
        }
        return (char)s_sum;
    }
}
