//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
/*
first we will try
 */
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 3;
        System.out.println(search(nums , target));
    }

    public static int search(int[] nums, int target) {

        /*
        firts I can do it simple linear search which may be brute force approach
        I will simply write a simple for loop for traversin across the array when i will
        find answer will return i(inndex of that number)

        */
        //brute force approach-> O(n)
//        for(int i=0;i<nums.length;i++){
//
//            if(nums[i] == target){
//
//                return i;
//
//            }
//        }
//        return -1;

/*
Best way to do it by binary search first we will calculate ethe middle off the elements
& will check which part is sorted if first part is sorted and target lies in the first sorted part then i will
simply will check end = mid -1 otherwise start = mid + 1
& will put other solved parts in the else section & will check where elements is present
if it will left part then I will end = mid -1 otherwise start = mid + 1;
 */
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
        int mid = start+(end - start)/2;
        if(nums[mid] == target){
            return  mid;
        }
        //check sorted half of teh array if left part is sorted
            if(nums[start] <= nums[mid]){

                if(nums[start]<=target && target<=nums[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(nums[mid]<=target && target<=nums[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
