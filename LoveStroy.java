import java.util.Scanner;
public class LoveStroy {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int n = 5;

        String parent = "codeforces";
        String[] arr ={
                "coolforsez",
                "cadafurcie",
                "codeforces",
                "paiuforces",
                "forcescode"

        };

        //logic
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