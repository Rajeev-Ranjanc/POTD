//Day 28
/* Done
Binary search in this problem i have to return the index if the target
 is found. If not, return the index where it would be if it were inserted in order.
 */
public class InsertPosition {
    public static void main(String[] args) {
        int[] snums = {1, 3, 5, 6};
        int target = 5;
    }

    public static int searchInsert(int[] nums, int target) {

        if (target > nums[nums.length - 1]) {

            return nums.length;

        }

        int start = 0;

        int end = nums.length - 1;

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                return mid;

            } else if (nums[mid] > target) {

                end = mid - 1;

                ans = mid;

            } else {

                start = mid + 1;

            }

        }

        return ans;

    }

}
