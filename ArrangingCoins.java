//https://leetcode.com/problems/arranging-coins/description/
/*
        it can be solve in the one line of but best way to do it by Binary Search
        As we know that K-th row will contain K number of coins
        so we will calculate the kth number & also the number of coins I need
        if coinsneed == n then we will simply return the mid & if it will less then
        start will mid+1 & if it  will be less than it will end = mid-1
        finaly I will return end

         Since at this point start > end, start will start pointing to a value greater
        than the desired result. We will return end as it will point to the correct
        int value.
        */

public class ArrangingCoins {
    public static void main(String[] args) {
        int  n = 5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        long start = 0;

        long end = n;

        while(start<=end){
            long mid = start + (end-start)/2;
            long coinsneed = mid*(mid+1)/2;

            if(coinsneed == n){
                return (int)mid;
            }
            else if(coinsneed < n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return (int)end;
    }
}
