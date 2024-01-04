//https://leetcode.com/problems/majority-element/
//majority elements which appears more than n/2 times (n is the length of the array)
public class Majority_Elements {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println (majorityElement ( nums ));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;


        for (int num : nums) {

            int count = 0;

            for (int i : nums) {

                if (num == i) {

                    count++;

                }
            }
            if (count > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
