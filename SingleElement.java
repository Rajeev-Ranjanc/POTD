//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
/*
However this is question of binary search but We can do it by Xor operation
        simply define a varible intitialise by 0 and perform the xor operation
        with all the elements of the array which element will have their duplicate
        elements will be zero and which will not have their duplicates will be as
        finally simply return the ans;
 */
//Day : 32
public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {

        //Brute Force -> other brute force would be by counting all the numbers
//        int ans = 0;
//
//        for (int num : nums) {
//
//            ans = ans ^ num;
//
//        }
//        return ans;

        //Binary Search
        /*

         */
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n-1]!= nums[n-2])
            return nums[n-1];
        int start = 1;

        int end = nums.length -2;

        while (start<=end){
            int mid = start +(end - start)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 == 1 && nums[mid] == nums[mid-1]){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }
}
