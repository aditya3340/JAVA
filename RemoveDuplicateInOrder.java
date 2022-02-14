package LeetCode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicateInOrder {
    public static void main(String[] args) {
        int[] arr = {1,1,2};

        System.out.println(removeDuplicates(arr));

    }
   static int removeDuplicates(int[] nums){
       if (nums == null) {
           return -1;
       }

       if (nums.length <= 1) {
           return nums.length;
       }

       Integer toReplace = 1;
       Integer current = 1;

       for (; current < nums.length; current++) {
           nums[toReplace] = nums[current];
           if (nums[toReplace] != nums[toReplace - 1]) {
               toReplace++;
           }
       }

       return toReplace;
   }

}
