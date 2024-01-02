//Second Largest Elements

import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int n = 6;
        int nums[] = {12, 35, 1, 10, 34, 1};
        System.out.println (SecondLargestElements_Optimal ( nums , n ));
    }
    public static int SecondLargestElemets_BruteForce(int[] nums , int n){
        //Brute force Method
        Arrays.sort (nums);
        for(int i=n-2;i>=0;i--){
            if(nums[i] == nums[i-1]){
                continue;
            }
            return nums[i];
        }
        return -1;
    }
    public static int SecondLargestElements_BtterApproach(int[] nums , int n){
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        //find largest elements
        for(int i=0;i<n;i++){
            large = Math.max ( large  , nums[i] );
        }
        //Now
        for (int i = 0; i < n; i++) {
            if(nums[i] > second_large && nums[i] != large){
                second_large =  nums[i];
            }
        }

        return second_large;
    }
    public static int SecondLargestElements_Optimal(int[] nums , int n){
     int largest = Integer.MIN_VALUE;
     int secondLargest = -1;
     for(int i=0;i<n;i++){
         if(nums[i] > largest){
             secondLargest = largest;
             largest = nums[i];
         } else if(nums[i] > secondLargest && nums[i] < largest) {
             secondLargest = nums[i];
             
         }

     }
     return secondLargest;
    }

}
