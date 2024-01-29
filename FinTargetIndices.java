//https://leetcode.com/problems/find-target-indices-after-sorting-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Day29 ->Done
First Approach:
This question cam be done first I will create an ArrayList which is to be return & then I can sort the Array later we will run
a loop and where target elements are present that index will add in the List later this list will be return

Second Approach:
In the sorted array, all the elements smaller than the target will appear before it, so just count the no.
of elements strictly smaller than the target, and also count the no. of occurrences of target.
Then think where will you find the first occurrence of target and the last occurrence.
 */
public class FinTargetIndices {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        //defining the list to return the ans;
        List<Integer> list = new ArrayList<>();

        //sorting the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                list.add(i);

            }

        }

        return list;

    }

}
