package com.box.leetcode.dp;

/**
 * 描述
 *
 * @author gbhello
 * @date 2024/7/16
 */
public class BagProblem {
    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};

        int bagSize = 4;
        System.out.println(bagProblem(weight,value,bagSize));
    }
    public static int bagProblem(int[] weight, int[] value, int bagWeight) {
        int goods=weight.length;
        int[][] dp =new int[goods][bagWeight+1];

        for(int j =weight[0];j<=bagWeight;j++){
            dp[0][j]=value[0];
        }

        for(int i=1;i<goods;i++){
            for(int j=1;j<=bagWeight;j++){
                if(j<weight[i]){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        return dp[goods-1][bagWeight];
}
}
