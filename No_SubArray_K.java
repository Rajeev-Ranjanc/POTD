//https://leetcode.com/problems/subarray-sum-equals-k/
/*
in this problem i have to return the total number of subarray whose sum i sequals to K
 */
/*
Day 27
 */
public class No_SubArray_K {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        /*
        its a question of sliding window but first we will try to
        do it's with the brute force approach
        */
        int count = 0;

        for(int i=0;i<nums.length;i++){

            int sum = 0;

            for(int j = i;j<nums.length;j++){
                sum+= nums[j];
                if(sum == k){
                    count++;
                }

            }
        }
        return count;
    }
}
