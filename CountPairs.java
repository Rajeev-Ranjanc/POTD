//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
/*Day 37
First I can try brute force in which I can solve it using two loops first loop will
start upto-length of the array and another one will start from the i+1 upto length of the array
and I will check that is element of i plus element of j strictly less than target then we will increase a counter
variable which one i have initialized outside from the both loop at last i will return that counter variable
 */
import java.util.ArrayList;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
//        int[] snums = {-1, 1, 2, 3, 1};
        int target = 2;
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println(countPairs(nums, target));
    }

    public static int countPairs(List<Integer> nums, int target) {

        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size() ; j++) {
                if(nums.get(i) + nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}
