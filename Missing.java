/*Day:37
//Amazon

        //Find sum of 'N' natural number ans also find sum of the array
        //and finally subtract sum of the array from the sum of natural number
        // int n = nums.length;
        // int sum = n*(n+1)/
        // 2;
        // int arrsum = 0;
        // for(int i=0;i<n;i++){
        //     arrsum+=nums[i];
        // }
        // return sum - arrsum;

        //number is going from [0,N] we always apply cyclic sort


 */
class MiisingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        //Amazon

        //Find sum of 'N' natural number ans also find sum of the array
        //and finally subtract sum of the array from the sum of natural number
        // int n = nums.length;
        // int sum = n*(n+1)/
        // 2;
        // int arrsum = 0;
        // for(int i=0;i<n;i++){
        //     arrsum+=nums[i];
        // }
        // return sum - arrsum;
    
        //number is going from [0,N] we always apply cyclic sort

        //applying cyclic sort
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i]< nums.length  && nums[i] != nums[correctIndex]){
                swap(nums , i , correctIndex);
            }
            else{
                i++;
            }
        }

        //now check for numbers which is present n the array or not
        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

        //swapping the elements
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}