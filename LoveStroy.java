import java.util.Scanner;

public class LoveStroy {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        sc.nextLine ();
        String parent = "codeforces";
        String[] arr = new String[n];

        //input of the Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine ();
        }

        //logic
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length (); j++) {
                if (parent.charAt ( j ) != arr[i].charAt ( j )) {
                    count++;
                }
            }
            System.out.println ( count );

        }
    }
}