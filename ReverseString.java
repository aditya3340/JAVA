package LeetCode;
//https://leetcode.com/problems/reverse-string/submissions/
class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length/2;i++){
            char t = s[i];
            s[i] = s[s.length -i -1];
            s[s.length -i -1] = t;
        }
    }
}