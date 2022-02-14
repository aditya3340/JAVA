package LeetCode;
//https://leetcode.com/problems/remove-element/submissions/
public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(arr,val));
    }
    static int removeElement(int[] nums, int val){
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            if (nums[0] != val) {
                return 1;
            } else {
                nums[0] = -1;
                return 0;
            }
        }

        int count = 0;
        int present = 0;
        for (; present < nums.length; present++) {

            if (nums[present] == val){
                nums[present] = 0;
                count ++;
            }else if (count > 0){
                nums[present - count] = nums[present];
            }

        }
        return  nums.length - count;
    }
}
