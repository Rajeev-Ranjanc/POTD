//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/

import java.util.Arrays;

/*
in this question I have total even number of elements and I have to make its pair of two and to return
the maximum pair of sum
Pairing-> pair is to be created after sorting of the array first and last elements of the array
 */
//day 16
public class MaximumPairSumArray {
    public static void main(String[] args) {
       int[] nums = {3,5,4,2,4,6};
        System.out.println (minPairSum ( nums ));
    }
    public static int minPairSum(int[] nums) {
        //first of all sort the array
        Arrays.sort ( nums );

        //for pairing the element we have to define two variable start and end and initialise as well
        int start = 0;
        int end = nums.length-1;
        int maxPairSum= Integer.MIN_VALUE;

        while (start<end){
            int currentsum = nums[start] + nums[end];
            maxPairSum = Math.max ( maxPairSum , currentsum );
            start++;
            end--;
        }
return maxPairSum;
    }
}
