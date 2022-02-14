package LeetCode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicatesII {
    public static void main(String[] args) {
     int[] arr = {0,0,0,0,1,1,1,2,3,3};
        System.out.println(removeDuplicate(arr));

    }
    public static int removeDuplicate(int[] nums){
        if(nums.length == 1)
            return 1;
        int count = 1;
        int left = 0;

        for (int right = 1; right < nums.length; right++){
            int temp = nums[right];
            if(nums[left] == nums[right])
                count++;
            else
                count = 1;

            if(count <= 2){
                left++;
                nums[left] = temp;
            }
        }
        return left + 1;

    }
}
