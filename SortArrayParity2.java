//https://leetcode.com/problems/sort-array-by-parity-ii/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayParity2 {
    public static void main(String[] args) {
        int[] nums = {4, 5};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        //list
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even.remove(0);
            } else {
                result[i] = odd.remove(0);
            }
        }
        return result;
}

}
