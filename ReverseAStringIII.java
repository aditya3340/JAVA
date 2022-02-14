package LeetCode;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
public class ReverseAStringIII {
    public static void main(String[] args) {
        String sc = "let's have a cupcake";
        System.out.println(reverseWords(sc));
    }
        private static void reverse(char[] arr, int start, int end)
        {
            //simple two pointer method for reversing the elements in char array
            while(start <= end)
            {
                char c = arr[start];
                arr[start] = arr[end];
                arr[end] = c;
                start++;
                end--;
            }
        }

        public  static String reverseWords(String s) {
            char[] chars = s.toCharArray();
            int startOfWord = 0;
            int endOfWord = 0;
            //simple approach
            //whenever we get a space char we send pointers start and endOfWord - 1 to reverse function
            //and then make startOfWord = endOfWord +1;
            //just dry run the code and you will understand the approach;

            for(;endOfWord < chars.length; endOfWord++)
            {
                if(chars[endOfWord] == ' ')
                {
                    reverse(chars, startOfWord, endOfWord-1);
                    startOfWord = endOfWord +1;
                }
            }
            reverse(chars, startOfWord, endOfWord-1);
            return new String(chars);
        }

}
