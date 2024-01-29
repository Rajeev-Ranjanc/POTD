//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/

//maximum sum of distinct subarray with given length
/*
this can be done by brute force techniques while considering the sliding window techniques
although I can do it by sliding window techniques
there is duplicate elements in the array if we can remove duplicates elements from the array & can store
it into another array then I can do further process
 */

public class Max_Sum_Dist_Subarray {

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 9, 9, 9};

        int k = 3;

        System.out.println(maximumSubarraySum(nums, k));

    }

    public static long maximumSubarraySum(int[] nums, int k) {
    return 0;
    }

}
