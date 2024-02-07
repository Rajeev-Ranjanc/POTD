
//https://leetcode.com/problems/koko-eating-bananas/description/
/*
koko have to eat the banana within the given period of time which is 8
Day 35
 */

import static java.lang.Math.ceil;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
//        System.out.printl?n((ceil(4.5)));
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        //this is brute force approach giving time limit exceeded
            /*
            how much banana can eat koko at one hour? that would be the maximum elements of the array
            right!!! so first I will have to find the max element of the array that going
            to be the last elements of the piles

             */

//        //lets calculate max elements from the array
//        int max = piles[0];
//        for (int i = 1; i < piles.length; i++) {
//            if(piles[0]<piles[i]){
//                max = piles[i];
//            }
//        }//maxelement calculated
//        for (int i = 1; i <= max; i++) {
//            int timereq = calctime(piles , i);
//
//            if(timereq<=h){
//                return i;
//            }
//        }
//        return 0;
//    }
//
//    private static int calctime(int[] piles, int i) {
//        double ans = 0;
//        for (int j = 0; j < piles.length; j++) {
//            ans += Math.ceil((double) piles[j] / i);
//        }
//        return (int) ans;


        //lets calculate max elements from the array
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[0] < piles[i]) {
                max = piles[i];
            }
        }

        /*
           //Now Optimal Search
           first we will find maximum element from the array because ans may vary from 1 to maximum element from the array
           then we will start calculating req time to eat banana after finding mid-elements if required time is less than or equal to
           hours then mid would be answer but we will shift end to mid -1 because we want to find minimum no of banana eat per hour
           and when req time will go more than h i will shift the other start = mid+1 and that mid we can answer into the
         */
        int start = 1;
        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int reqtime = calctime(piles, mid);
            if (reqtime <= h) {
//                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
//        return ans;
        return start;
    }

    private static int calctime(int[] piles, int i) {
        double ans = 0;
        for (int pile : piles) {
            ans += Math.ceil((double) pile / i);
        }
        return (int) ans;
    }
}

