//https://leetcode.com/problems/missing-number/
public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        System.out.println (missingNumber ( nums , n ));
    }
    public static int missingNumber(int[] nums , int n) {
        //there is number from [0,N] that's why i can apply sum of natural number
        //but not a good practice

//        int sum = n*(n+1)/2;
//        int arrsum = 0;
//        for (int i = 0; i < n; i++) {
//            arrsum+= nums[i];
//        }
//        return sum - arrsum;

        //best way to do it apply cyclic sort because there is number from 1 to n

        //number is going from [0,N] we always apply cyclic sort
        //there are N+1 total number of elements in the Array
        //so every number will at be there index number means 0 wiil be at 0 & 5 will at 5
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swaps ( nums, i, correctIndex );
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index)
                return index;
        }
        return nums.length;

    }

    private static void swaps(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
