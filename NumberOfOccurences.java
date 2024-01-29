//User function Template for Java
//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
/*
Day 29 ->Done
Here, given array is sorted array so, I can go for the binary search then
first we will search for the first occurrences & later last occurrences and when we will find both
I will return end - start + 1

these both occurrences can be found by one function also I will just need to pass one more parameter argument to the function
like isfirstIndex of boolean type if this will true I will simply end = mid-1;
 & if false then start = mid + 1 in the arr[mid] == x section
 Done
 & all set
 */
class NumberOfOccurences {
    int count(int[] arr, int n, int x) {
        int firstOccurrence = findFirstOccurrence(arr, n, x);
        if (firstOccurrence == -1) {
            return 0; 
        }
        int lastOccurrence = findLastOccurrence(arr, n, x);
        return lastOccurrence - firstOccurrence + 1;
    }
    //function which will find thw first occurrences of the elements
    private int findFirstOccurrence(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
    //function which will find thw last occurrences of the elements
    private int findLastOccurrence(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}