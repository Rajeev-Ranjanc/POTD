//https://leetcode.com/problems/number-of-good-pairs/
public class Good_pairs{
    public static void main(String[] args) {

        int[] nums = {1,2,3};

        System.out.println (numIdenticalPairs ( nums ));
    }
    public static int numIdenticalPairs(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {

                if(nums[i] == nums[j] && i<j){

                    ans++;

                }

            }

        }

        return ans;
    }

}
