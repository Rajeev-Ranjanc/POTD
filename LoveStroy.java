import java.util.Scanner;

//https://codeforces.com/contest/1829/problem/A
public class LoveStroy {
//    public static void main(String[] args) {
//        String parent = "codeforces";
//        String s = "forcescode";
//        System.out.println (totalchange ( parent , s ));
//    }
//    public static int totalchange(String parent , String s){
//        int count =0;
//        for (int i = 0; i < parent.length (); i++) {
//            if(parent.charAt ( i ) != s.charAt ( i )){
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = 5;

        String parent = "codeforces";
        String[] arr = {
                "coolforsez",
                "cadafurcie",
                "codeforces",
                "paiuforces",
                "forcescode",
        };


        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length (); j++) {
                if(parent.charAt ( j ) != arr[i].charAt(j)){
                    count++;
                }
            }
            System.out.println (count);

        }
    }
}
