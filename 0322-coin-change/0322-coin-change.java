import java.util.Arrays;

class Solution {
    int[] dp;

    public int f(int[] coins, int sum) {
        if (sum == 0) return 0;
        if (dp[sum] != -1) return dp[sum];

        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= sum && f(coins, sum - coin) != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + f(coins, sum - coin));
            }
        }

        return dp[sum] = ans;
    }

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int result = f(coins, amount);
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}