package LeetCode;
//https://leetcode.com/problems/rotate-array/submissions/
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
       //Rotate Right
        int k = 3;
        //Output--> {3,4,5,1,2}
        int[] ans = rotate(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=nums[i];
        }
       for(int j=0;j<n;j++){
            nums[j]=temp[j];
        }
        return nums;
    }
}
