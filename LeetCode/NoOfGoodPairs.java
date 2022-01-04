package LeetCode;
//https://leetcode.com/problems/number-of-good-pairs/submissions/
public class NoOfGoodPairs {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j< i; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
