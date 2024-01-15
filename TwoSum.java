import java.util.Arrays;
//day 15
//https://leetcode.com/problems/two-sum/description/
//this problem is solved using two loops one is starts from the 0 to length and another one starts from the i+1 and goes upto length
//
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println ( Arrays.toString ( twoSum ( nums ,  target ) ) );
    }

    public static int[] twoSum(int[] nums, int target) {
      int[] ans = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
