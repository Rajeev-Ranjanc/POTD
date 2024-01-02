//https://leetcode.com/problems/missing-number/
public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        System.out.println (missingNumber ( nums , n ));
    }
    public static int missingNumber(int[] nums , int n) {
        int sum = n*(n+1)/2;
        int arrsum = 0;
        for (int i = 0; i < n; i++) {
            arrsum+= nums[i];
        }
        return sum - arrsum;
    }

}
