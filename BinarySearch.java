//https://leetcode.com/problems/binary-search/submissions/1159441202/
//Day 28
/*Done
Simply binary search I have to return the index of the target elements of the array if the elements is present int the array
otherwise return -1
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums , target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

         while (start<=end){

             int mid = start+(end-start)/2;

             if(nums[mid] == target){

                 return mid;

             }

             else if (nums[mid] < target){

                 start = mid+1;

             }
             else {
                 end = mid-1;
             }
         }
         return -1;
    }
}
