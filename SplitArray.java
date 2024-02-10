//https://leetcode.com/problems/split-array-largest-sum/
class SplitArray {
    public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);  //at the end it will contain max of the array
            end+=nums[i];
        }

        //binary search
        while(start<end){
            int sum=0;
            int pieces=1;
            int mid=start+(end-start)/2;
            for(int num:nums){
                if(sum+num>mid){
                     //you cannot add this in the subarray,make new one
                   //say you add this in the new subarray,them sum=num
                   sum=num;
                   pieces++;
                }
                else{
                    sum=sum+num;
                }
            }
            if(pieces>m){
                start=mid+1;

            }
            else{
                end=mid;
            }
        }
        return start; // start==end
    }
}