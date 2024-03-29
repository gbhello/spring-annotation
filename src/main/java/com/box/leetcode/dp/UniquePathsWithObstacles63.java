package com.box.leetcode.dp;

/**
 * 功能描述：
 *
 * @author gengbin29080
 * @date 2023/5/10
 */
public class UniquePathsWithObstacles63 {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m][n];
    if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
      return 0;
    }
    for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
      dp[i][0] = 1;
    }
    for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = obstacleGrid[i][j] == 0 ? dp[i][j - 1]+dp[i-1][j] : 0;
      }
    }
    return dp[m - 1][n - 1];
  }
}
