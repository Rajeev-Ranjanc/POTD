//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
/*
In this problem i have to count the -ve number which is present in the array
it is question of binary search but but i can apply the brute force first
I'm lil confuse in 2d sorted grid and applying binary search in this

Day -> 31
 */
public class NegativeSorted {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));

    }
    public static int countNegatives(int[][] grid) {
        int cont = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]  < 0){
                    cont++;
                }
            }
        }

        return cont;
    }
}
