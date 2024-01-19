/**
 * climbingStairs
 */
public class climbingStairs {

    public static void main(String[] args) {
        int n = 8;

        System.out.println(climbingStairsTopDown(n));

    }

    public static int climbingStairsTopDown(int n){
        if(n <0) return 0;
        if(n == 0) return 1;

            // System.out.println(n);
        return climbingStairsTopDown(n-1) + climbingStairsTopDown(n-2) + climbingStairsTopDown(n-3);
    }
}