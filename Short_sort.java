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
        int n = sc.nextInt ();
        String[] str = new String[n];
        for (int j = 0; j < n; j++) {
            str[j] = sc.nextLine ();
        }

        String valid ="abc";

       for(int k=0;k<n;k++){
           int count =0;

           for (int i = 0; i < str[0].length (); i++) {

               if(str[i].charAt ( i )!=valid.charAt ( i )){
                   count++;
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


}


