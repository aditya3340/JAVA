package LeetCode;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));
    }
    static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            List<String> list = new ArrayList<>();
            return list;
        }
        return padRet("",digits);
    }
    static ArrayList<String> padRet(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0)-'0'; //this will convert '2' into 2


        if(digit < 7){
            for (int i = (digit-2)*3; i < (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }
        }
        else if(digit == 7){
            for (int i = (digit-2)*3; i <= (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }
        }
        else if(digit==8){
            for (int i = (digit-2)*3 + 1; i <= (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }
        }
        else{
            for (int i = (digit-2)*3 + 1; i <= (digit-1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }
        }

        return list;
    }
}
