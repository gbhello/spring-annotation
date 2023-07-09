package com.box.leetcode.dp;

/**
 * 功能描述：
 *
 * @author gengbin29080
 * @date 2023/5/18
 */
public class IntegerBreak343 {
  public int integerBreak(int n){
    int[] dp = new int[n+1];
    for(int i=2;i<=n;i++){
      int curMax=0;

      for(int j=1;j<i;j++){
        curMax =Math.max(curMax, Math.max(j*(i-j),j*dp[i-j]));
      }
      dp[i]=curMax;
    }
    return dp[n];
  }

}
