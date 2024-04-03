package day1session1;
import java.util.ArrayList;
import java.util.List;

public class D01S04d {
    public static List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return result;
        }
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> combination = new ArrayList<>();
                combination.add(nums[i]);
                combination.add(nums[j]);
                result.add(combination);
            }
        }
         return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        List<List<Integer>> combinations = findCombinations(nums, k);
        System.out.println("Distinct combinations of size " + k + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
