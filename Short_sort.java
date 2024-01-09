//https://codeforces.com/contest/1873/problem/A

//need to be modified

import java.util.Scanner;
//import java.lang.String;

public class Short_sort {
//6
//abc
//acb
//bac
//bca
//cab
//cba
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        char[] valid = {'a','b','c'};
        //getting input of the size of the array
        int n = sc.nextInt ();
        sc.nextLine ();
        //getting input of the string array
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine ();
        }
        //solving approach->if no of displaced no of elements is even from the original string then "YES" otherwise "NO"
        for (int i = 0; i < n; i++) {
//            System.out.println (str[i]);
            char[] comp = str[i].toCharArray ();
            int count = 0;
            for (int j=0;j<comp.length;j++){
                if(comp[j] != valid[j]){
                    count++;
                }
            }
            if(count%2==0){
                System.out.println ("YES");
            }
            else {
                System.out.println ("NO");
            }
        }
    }
}


