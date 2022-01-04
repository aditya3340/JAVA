package LeetCode;

import java.util.Arrays;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
public class TwoSumArray {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        while(start<end){
            if(numbers[start] + numbers[end] == target ){
                return new int[]{start+1,end+1};
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
