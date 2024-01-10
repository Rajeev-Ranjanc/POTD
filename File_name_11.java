//https://codeforces.com/problemset/problem/978/B

import java.util.Scanner;

public class File_name_11 {
    public static void main(String[] args) {
//        6
//        xxxiii
        Scanner in = new Scanner ( System.in );

        int size = in.nextInt ();
        in.nextLine ();
        String str = in.nextLine ();
        System.out.println ( removals ( str, size ) );
    }

    public static int removals(String str, int size) {
        int count = 0;
        int x_number = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt ( i ) == 'x') {
                count++;//counting the no of the x in the string
                if (count >= 3) {//if there is >= 3 x then increse the x removals
                    x_number++;
                }
            }else {
                    count = 0;
                }

        }
        return x_number;
    }
}
