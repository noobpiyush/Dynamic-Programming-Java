import java.util.Arrays;

/**
 * climbingStairs
 */
public class climbingStairs {

    public static void main(String[] args) {
        int n = 8;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbingStairsBottomUpOptimised(n));

    }

    public static int climbingStairsTopDown(int n, int dp []){
        if(n <0) return 0;
        if(n == 0) return 1;

        if(dp[n] != -1) return dp[n];

            // System.out.println(n);
        return dp[n] = climbingStairsTopDown(n-1,dp) + climbingStairsTopDown(n-2,dp) + climbingStairsTopDown(n-3,dp);
    }
    public static int climbingStairsBottomUp(int n){
       int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] =2;

        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

            // System.out.println(n);
        return dp[n];
    }

    public static int climbingStairsBottomUpOptimised(int n){
        if(n == 0)return 1;
        if (n<=2) {
            return n;
        }
    
       int zeroth = 1;
       int first = 1;
       int second = 2;

       for (int i = 3; i <=n; i++) {
        int res = zeroth + first + second;
        zeroth = first;
        first = second;
        second = res;
       }
             // System.out.println(n);
         return second;
     }
}