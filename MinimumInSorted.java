//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
/*

First approach to solve this problem is by brute force which is simply linear search

Although it is a sorted rotated array so i can apply binary search for the optimal solution

Day 32
 */
public class MinimumInSorted {

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {

//        Brute Force Approach
//        int ans = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//
//            if (ans > nums[i]) {
//
//                ans = nums[i];
//
//            }
//        }
//        return ans;

        int start = 0;
        int end = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (start<=end){
            int mid = start +(end - start)/2;


            //in this case array will be sorted
            if(nums[start] <= nums[end]){
                ans = Math.min(nums[start] , ans);
                break;
            }

            //if the left part of the array is sorted
            if(nums[start] <= nums[mid]){
                ans = Math.min(ans , nums[start]);
                //eliminating left half
                start = mid+1;
            }
            //if the right part is sorted
            else{
                ans = Math.min(ans , nums[mid]);
                //eliminating right half
                end = mid-1;

            }
        }
        return ans;
    }
}
