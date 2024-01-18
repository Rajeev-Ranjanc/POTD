//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
public class CountNoPair_Diff {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(countKDifference(nums , k));
    }

    public static int countKDifference(int[] nums, int k) {
        /*
        here! we are subtracting 0 elemnts by 1 and onward
        same first elements we are subtracting 2 and onwards
        so if we start by 0 then i can start j by i+1 and there i sabs function in java to
        produce absolutet vale just applyied it & got submitted
        */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
