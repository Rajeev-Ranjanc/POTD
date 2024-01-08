
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        long[] a ={2, 2, 2, 2,2};
        int n = a.length;
        System.out.println (Arrays.toString ( minAnd2ndMin ( a , n ) ));
    }
    public static long[] minAnd2ndMin(long a[], long n)
    {
        long[] ans = new long[a.length];

        Arrays.sort(a);

        ans[0]=a[0];

        for(int i=1;i<n;i++){

            if(a[i-1]!=a[i]){

                ans[1] = a[i];
                break;
            }
        }
        return ans;
    }
}
