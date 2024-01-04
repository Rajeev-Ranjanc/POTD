//but giving error -> time limit exceed
public class Decreasing_Sequence {
    public static void main(String[] args) {
       int n = 4, k = 5;
       long[] a = {1,1,2,3};
        System.out.println (minMoves ( a , n , k ));
    }
    public static long minMoves(long[] a, long n, long k) {
        int count =0;
        for (int i = 1; i < n; i++){
            while (a[i-1]<a[i]){
                a[i]=a[i]-k;
                count++;
            }
        }
    return count;

    }

}
