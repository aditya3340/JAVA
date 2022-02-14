package LeetCode;

import java.util.Arrays;

public class TargetArrayOfGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public  static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            /*for (int j = target.length -1; j > index[i] ; j--) {
                target[j] = target[j-1];
            }*/
            //more optimized
            for (int j = i; j > index[i] ; j--) {
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
