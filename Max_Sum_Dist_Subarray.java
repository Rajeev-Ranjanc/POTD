import java.util.TreeSet;

import static java.lang.reflect.Array.set;

//maximum sum o fdistinct subarray with given length
public class Max_Sum_Dist_Subarray {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums , k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] ans = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
           ans[i] = set.getFirst();
           set.pollFirst();
        }
        for (int i = 0; i < set.size(); i++) {
            System.out.println(ans[i]);
        }
        return 1;
    }
}
