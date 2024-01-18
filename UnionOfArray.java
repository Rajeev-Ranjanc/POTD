

//Tree set ncz that dosen't contains duplicate elements
import java.util.TreeSet;
public class UnionOfArray {
    public static void main(String[] args) {
        int n = 6, m = 2;
        int[] a = {85, 25, 1 ,32, 54, 6};
        int[] b = {85,2};
        System.out.println (doUnion ( a , n , b , m ));
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        TreeSet<Integer> set = new TreeSet<> ();
        for (int j : a) {
            set.add ( j );
        }
        for (int j : b) {
            set.add ( j );
        }
        return set.size ();
    }
}
