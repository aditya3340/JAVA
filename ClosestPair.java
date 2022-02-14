package LeetCode;
//GFG Question
//https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/?ref=lbp
import java.util.Arrays;

public class ClosestPair {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int target = 32;
        System.out.println(Arrays.toString(CPInArrays(arr1,arr2,target)));
    }
    static int[] CPInArrays(int[] arr1, int[] arr2, int target){

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int min = Math.min((arr1[i]+arr2[j]),target);
                if (min < arr1[i]+arr2[j]-target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
