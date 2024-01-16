import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity/
//Day 16
/*
        Here i need to sort arrays by odd & even then we simply create an arrray of same length
        & created two new arraylist odd & evn and i have added odd elements in add list & even in even list
        and after this i have copy even elements first in the array and odd elements later int that array
        */


public class ParitySort {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println ( Arrays.toString ( sortArrayByParity ( nums ) ) );
    }

    public static int[] sortArrayByParity(int[] nums) {
        //creation of array to return
        int[] ans = new int[nums.length];
        //arraylist for the even elements of the array
        ArrayList<Integer> even = new ArrayList<> ();
        //arraylist for the odd elements of the array
        ArrayList<Integer> odd = new ArrayList<> ();

        //copying even elemnets in the even list & odd elements in the odd list
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                even.add ( nums[i] );
            }
            else {
                odd.add ( nums[i] );
            }
        }
        for (int i = 0; i < even.size (); i++) {
            ans[i] = even.get ( i );
        }
        for (int i = 0; i < odd.size (); i++) {
            ans[even.size ()+i] = odd.get ( i );
        }
        return ans;
    }
}
