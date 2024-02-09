//Day:39
/*
I will simply start the start from 0 and end from length -1 and will calculate the mid if the mid element will
be less than the mid+1 elements then start is going to be mid +1 else we will return end
and after outside of the while loop we will return start
 */
public class FindPeakEle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
            
    }
}