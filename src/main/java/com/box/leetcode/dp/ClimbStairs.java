package com.box.leetcode.dp;

/**
 * 功能描述：
 *
 * @author gengbin29080
 * @date 2023/5/4
 */
public class ClimbStairs {

  /**
   *
   * @param n
   * @return
   */
  public int climbStairs(int n) {
    if (n < 3) {
      return n;
    }
    int[] dp = new int[3];
    dp[1] = 1;
    dp[2] = 2;
    int sum = 0;
    for (int i = 3; i <= n; i++) {
      sum = dp[1] + dp[2];
      dp[1] = dp[2];
      dp[2] = sum;
    }
    return sum;
  }
}
