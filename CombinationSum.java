package LeetCode;
//https://leetcode.com/problems/combination-sum/
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }

   // static List<List<Integer>> result = new ArrayList<>();

/*    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, candidates, target, new ArrayList<>());
        return result;
    }

    static void backtrack(int index, int[] arr, int target, List<Integer> currList) {
        if (target < 0) return;

        if (target == 0) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int tmpIndex = index; tmpIndex < arr.length; tmpIndex++) {
            if (target - arr[tmpIndex] < 0) continue;

            currList.add(arr[tmpIndex]);
            backtrack(tmpIndex, arr, target - arr[tmpIndex], currList);
            currList.remove(currList.size() - 1);
        }

    }

 */

    static List<List<Integer>> ans = new ArrayList<>();
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(0, candidates, target, new ArrayList<>());
        return ans;
    }


    static void helper(int i, int[] candidates, int target, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (i == candidates.length) {
            return;
          }

        if (target - candidates[i] >= 0) {
            list.add(candidates[i]);
            helper(i, candidates, target - candidates[i], list);
            list.remove(new Integer(candidates[i])); //BackTracking
        }
        helper(i+1,candidates,target,list);
    }
}
