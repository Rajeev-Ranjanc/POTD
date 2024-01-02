<<<<<<< HEAD
//https://leetcode.com/problems/number-of-good-pairs/
public class Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println (numIdenticalPairs ( nums ));
    }
    public static int numIdenticalPairs(int[] nums ){
        int goodpairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && i<j){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }
}
=======
//https://leetcode.com/problems/number-of-good-pairs/
public class Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println (numIdenticalPairs ( nums ));
    }
    public static int numIdenticalPairs(int[] nums ){
        int goodpairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && i<j){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }
}
>>>>>>> 60311aea8f9cb3b064128dcec23497749fe249d0
