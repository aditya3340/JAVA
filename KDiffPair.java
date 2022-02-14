package LeetCode;
//https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/
import java.util.Arrays;

public class KDiffPair {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums,k));
    }
    public static int findPairs(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = 1;

        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        while(j < nums.length && i < nums.length){

            if( i == j || nums[j] - nums[i] < k ){
                j++;
                continue;
            }

            if(nums[j] - nums[i] == k){
                count++;
                j++;

                while(j < nums.length && nums[j] == nums[j-1]) {
                    j++;
                }
                if(j == nums.length) {
                    return count;
                }
            }

            i++;
            while( i < j && nums[i] == nums[i -1]) {
                i++;
            }

        }
        return count;
    }
}
